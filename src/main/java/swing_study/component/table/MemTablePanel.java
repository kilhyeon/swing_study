package swing_study.component.table;

import javax.swing.SwingConstants;

import swing_study.panel.Member_info;

public class MemTablePanel extends AbstractCustomTablePanel<Member_info> {

	@Override
	protected void setAlignAndWidth() {
		// 컬럼내용 정렬
		setTableCellAlign(SwingConstants.CENTER, 0, 1, 2, 3, 4, 5);

		// 컬럼별 너비 조정
		setTableCellWidth(250, 200, 300, 400, 500, 100);

	}

	@Override
	public Object[] toArray(Member_info t) {
		return new Object[] { 
				t.getMemNo(),
				t.getMemName(),
				t.getMemBirth(),
				t.getMemTel(),
				t.getMemCp(),
				t.getMemAddr() };
	}

	@Override
	public String[] getColumnNames() {
		return new String[] { "회원번호", "회원명", "생년월일", "전화번호", "휴대전화", "주소" };
	}

}
