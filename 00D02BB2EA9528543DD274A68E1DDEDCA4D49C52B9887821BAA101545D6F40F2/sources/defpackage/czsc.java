package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: czsc  reason: default package */
/* loaded from: classes5.dex */
public final class czsc extends LinearLayout {
    public static final /* synthetic */ int b = 0;
    private static final dcdn<Integer, Integer> c = dcdn.o(0, 2131232904, 1, 2131232902, 2, 2131232901, 3, 2131232900, 4, 2131232903);
    public czsa a;

    public czsc(Context context) {
        super(context);
        setOrientation(1);
    }

    public void setOnAnswerSelectClickListener(czsa czsaVar) {
        this.a = czsaVar;
    }

    public void setUpSingleSelectView(duck duckVar) {
        int a;
        dtzc dtzcVar = duckVar.a;
        if (dtzcVar == null) {
            dtzcVar = dtzc.b;
        }
        final View[] viewArr = new View[dtzcVar.a.size()];
        dtzc dtzcVar2 = duckVar.a;
        if (dtzcVar2 == null) {
            dtzcVar2 = dtzc.b;
        }
        final dsrj<dtza> dsrjVar = dtzcVar2.a;
        int a2 = ducj.a(duckVar.b);
        boolean z = ((a2 != 0 && a2 == 4) || ((a = ducj.a(duckVar.b)) != 0 && a == 5)) && dsrjVar.size() == 5;
        for (final int i = 0; i < dsrjVar.size(); i++) {
            int a3 = dtyy.a(dsrjVar.get(i).a);
            if (a3 == 0 || a3 != 4) {
                LayoutInflater.from(getContext()).inflate(R.layout.survey_question_single_select_item, (ViewGroup) this, true);
                View childAt = getChildAt(getChildCount() - 1);
                viewArr[i] = childAt;
                TextView textView = (TextView) childAt.findViewById(R.id.survey_multiple_choice_text);
                textView.setText(dsrjVar.get(i).c);
                textView.setContentDescription(dsrjVar.get(i).c);
                ImageView imageView = (ImageView) viewArr[i].findViewById(R.id.survey_multiple_choice_icon);
                if (z) {
                    int a4 = ducj.a(duckVar.b);
                    imageView.setImageDrawable(czph.j(sl.b(getContext(), c.get(Integer.valueOf((a4 != 0 && a4 == 5) ? ((dcmn) c).e - (i + 1) : i)).intValue()), getContext(), akm.c(getContext(), R.color.survey_grey_icon_color)));
                } else {
                    imageView.setVisibility(8);
                }
                viewArr[i].setOnClickListener(new View.OnClickListener(this, viewArr, dsrjVar, i) { // from class: czrv
                    private final czsc a;
                    private final View[] b;
                    private final List c;
                    private final int d;

                    {
                        this.a = this;
                        this.b = viewArr;
                        this.c = dsrjVar;
                        this.d = i;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        final czsc czscVar = this.a;
                        View[] viewArr2 = this.b;
                        final List list = this.c;
                        final int i2 = this.d;
                        for (View view2 : viewArr2) {
                            view2.setOnClickListener(null);
                            view2.setClickable(false);
                        }
                        view.postOnAnimationDelayed(new Runnable(czscVar, list, i2) { // from class: czry
                            private final czsc a;
                            private final List b;
                            private final int c;

                            {
                                this.a = czscVar;
                                this.b = list;
                                this.c = i2;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                czsc czscVar2 = this.a;
                                List list2 = this.b;
                                int i3 = this.c;
                                czscVar2.a.a(new czsb(3, ((dtza) list2.get(i3)).c, ((dtza) list2.get(i3)).b));
                                int i4 = czph.a;
                            }
                        }, 200L);
                    }
                });
            } else {
                LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(getContext()).inflate(R.layout.survey_question_single_select_other_entry, (ViewGroup) this, true);
                final EditText editText = (EditText) linearLayout.findViewById(R.id.survey_other_option);
                linearLayout.findViewById(R.id.survey_other_option_background).setOnClickListener(new View.OnClickListener(editText) { // from class: czrw
                    private final EditText a;

                    {
                        this.a = editText;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        EditText editText2 = this.a;
                        int i2 = czsc.b;
                        editText2.requestFocus();
                        czph.l(editText2);
                        view.scrollTo(0, view.getBottom());
                    }
                });
                editText.addTextChangedListener(new czrz(this, dsrjVar, i));
                editText.setOnFocusChangeListener(new View.OnFocusChangeListener(this, editText, dsrjVar, i) { // from class: czrx
                    private final czsc a;
                    private final EditText b;
                    private final List c;
                    private final int d;

                    {
                        this.a = this;
                        this.b = editText;
                        this.c = dsrjVar;
                        this.d = i;
                    }

                    @Override // android.view.View.OnFocusChangeListener
                    public final void onFocusChange(View view, boolean z2) {
                        czsc czscVar = this.a;
                        EditText editText2 = this.b;
                        List list = this.c;
                        int i2 = this.d;
                        if (z2) {
                            editText2.setHintTextColor(akm.c(czscVar.getContext(), R.color.survey_hint_text_color));
                            czscVar.a.a(new czsb(4, "", ((dtza) list.get(i2)).b));
                            return;
                        }
                        editText2.setHintTextColor(akm.c(czscVar.getContext(), R.color.survey_hint_text_unfocused_color));
                    }
                });
                viewArr[i] = editText;
            }
        }
    }
}
