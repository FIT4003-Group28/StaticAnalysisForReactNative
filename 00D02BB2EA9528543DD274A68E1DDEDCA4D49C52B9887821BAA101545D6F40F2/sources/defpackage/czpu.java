package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: czpu  reason: default package */
/* loaded from: classes5.dex */
public final class czpu extends LinearLayout {
    public boolean[] a;
    public String b;
    public czpt c;

    public czpu(Context context) {
        super(context);
        setOrientation(1);
    }

    public void setOnAnswerSelectClickListener(czpt czptVar) {
        this.c = czptVar;
    }

    public void setUpMultipleSelectView(dubb dubbVar, boolean[] zArr) {
        if (zArr == null) {
            dtzc dtzcVar = dubbVar.a;
            if (dtzcVar == null) {
                dtzcVar = dtzc.b;
            }
            this.a = new boolean[dtzcVar.a.size()];
        } else {
            this.a = zArr;
        }
        dtzc dtzcVar2 = dubbVar.a;
        if (dtzcVar2 == null) {
            dtzcVar2 = dtzc.b;
        }
        dsrj<dtza> dsrjVar = dtzcVar2.a;
        for (final int i = 0; i < dsrjVar.size(); i++) {
            int a = dtyy.a(dsrjVar.get(i).a);
            if (a == 0 || a != 4) {
                boolean z = this.a[i];
                int a2 = dtyy.a(dsrjVar.get(i).a);
                if (a2 == 0) {
                    a2 = 1;
                }
                String str = a2 == 5 ? "NoneOfTheAbove" : null;
                String str2 = dsrjVar.get(i).c;
                LayoutInflater.from(getContext()).inflate(R.layout.survey_question_multiple_select_item, (ViewGroup) this, true);
                FrameLayout frameLayout = (FrameLayout) getChildAt(i);
                final CheckBox checkBox = (CheckBox) frameLayout.findViewById(R.id.survey_multiple_select_checkbox);
                checkBox.setText(str2);
                checkBox.setContentDescription(str2);
                checkBox.setChecked(z);
                checkBox.setOnCheckedChangeListener(new czpr(this, i));
                frameLayout.setOnClickListener(new View.OnClickListener(checkBox) { // from class: czpp
                    private final CheckBox a;

                    {
                        this.a = checkBox;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.a.performClick();
                    }
                });
                if (str != null) {
                    checkBox.setTag(str);
                }
            } else {
                LayoutInflater.from(getContext()).inflate(R.layout.survey_question_multiple_select_other_option, (ViewGroup) this, true);
                LinearLayout linearLayout = (LinearLayout) getChildAt(i);
                final CheckBox checkBox2 = (CheckBox) linearLayout.findViewById(R.id.survey_multiple_select_checkbox);
                checkBox2.setContentDescription(getResources().getString(R.string.survey_other_option_hint));
                checkBox2.setChecked(this.a[i]);
                checkBox2.setOnCheckedChangeListener(new czpr(this, i));
                checkBox2.setTag("OtherPleaseSpecify");
                final EditText editText = (EditText) linearLayout.findViewById(R.id.survey_other_option);
                linearLayout.findViewById(R.id.survey_other_option_background).setOnTouchListener(new View.OnTouchListener(checkBox2, editText) { // from class: czpn
                    private final CheckBox a;
                    private final EditText b;

                    {
                        this.a = checkBox2;
                        this.b = editText;
                    }

                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        CheckBox checkBox3 = this.a;
                        EditText editText2 = this.b;
                        if (motionEvent.getAction() == 1) {
                            if (motionEvent.getX() < 0.0f || motionEvent.getX() >= checkBox3.getWidth() || motionEvent.getY() < 0.0f || motionEvent.getY() >= checkBox3.getHeight()) {
                                editText2.requestFocus();
                                czph.l(editText2);
                                return false;
                            }
                            checkBox3.performClick();
                            return false;
                        }
                        return false;
                    }
                });
                editText.addTextChangedListener(new czpq(this, i, checkBox2));
                editText.setOnFocusChangeListener(new View.OnFocusChangeListener(this, i, checkBox2, editText) { // from class: czpo
                    private final czpu a;
                    private final int b;
                    private final CheckBox c;
                    private final EditText d;

                    {
                        this.a = this;
                        this.b = i;
                        this.c = checkBox2;
                        this.d = editText;
                    }

                    @Override // android.view.View.OnFocusChangeListener
                    public final void onFocusChange(View view, boolean z2) {
                        czpu czpuVar = this.a;
                        int i2 = this.b;
                        CheckBox checkBox3 = this.c;
                        EditText editText2 = this.d;
                        if (z2) {
                            czpuVar.a[i2] = true;
                            checkBox3.setChecked(true);
                            editText2.setHintTextColor(akm.c(czpuVar.getContext(), R.color.survey_hint_text_color));
                            czpuVar.c.a(new czps(czpuVar.b, czpuVar.a));
                            return;
                        }
                        editText2.setHintTextColor(akm.c(czpuVar.getContext(), R.color.survey_hint_text_unfocused_color));
                    }
                });
            }
        }
    }
}
