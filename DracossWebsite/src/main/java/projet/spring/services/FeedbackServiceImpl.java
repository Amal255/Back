package projet.spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import projet.spring.entities.Feedback;
import projet.spring.repository.FeedbackRepository;

@Service
public class FeedbackServiceImpl implements FeedbackService{

	@Autowired
	FeedbackRepository feedbackRep;
	
	@Override
	public Feedback AjouterFeedback(Feedback f) {
		feedbackRep.save(f);
		return f;
	}

	@Override
	public void DeleteFeedback(Feedback f) {
		feedbackRep.delete(f);
		
	}

	@Override
	public void DeleteById(Long id_feedback) {
		feedbackRep.deleteById(id_feedback);
	}

	@Override
	public List<Feedback> getAllFeedback() {
		return (List<Feedback>) feedbackRep.findAll();
	}

}
