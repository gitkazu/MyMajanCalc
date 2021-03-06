package jp.android.mymajancalc;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Fragment2 extends Fragment {
	private static final String ARG_SECTION_NUMBER = "section_number";

	 public static Fragment2 newInstance(int sectionNumber) {
		 Fragment2 fragment = new Fragment2();
		 Bundle args = new Bundle();
		  
		 args.putInt(ARG_SECTION_NUMBER, sectionNumber);
		 fragment.setArguments(args);
		 return fragment;
		 }
	 
	 @Override
	 public void onCreate(Bundle savedInstanceState) {
	 super.onCreate(savedInstanceState);
	 }
	 
	 
	@Override
	public View onCreateView(
		LayoutInflater inflater, 
		ViewGroup container, 
		Bundle savedInstanceState) {
		return inflater.inflate(R.layout.fragment2, container, false);
	}
	 @Override
	 public void onAttach(Activity activity) {
	 super.onAttach(activity);
	 ((MainActivity) activity).onSectionAttached( getArguments().getInt(ARG_SECTION_NUMBER));
	 }

}