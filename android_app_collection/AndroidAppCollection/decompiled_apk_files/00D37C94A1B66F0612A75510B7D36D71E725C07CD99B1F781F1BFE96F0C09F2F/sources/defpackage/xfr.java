package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.Arrays;
import java.util.List;
/* compiled from: PG */
/* renamed from: xfr  reason: default package */
/* loaded from: classes4.dex */
public final class xfr extends aizc implements View.OnClickListener, View.OnTouchListener, xge {
    public xgd a;
    private ViewGroup b;
    private ViewGroup c;
    private TextView[] d;
    private View e;
    private View f;
    private TextView g;
    private TextView h;
    private Drawable i;
    private Drawable j;
    private xhk k;
    private boolean l;
    private int m;
    private boolean n;
    private boolean o;
    private int p;
    private int q;

    public xfr(Context context) {
        super(context);
        if (this.b == null) {
            ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.survey_overlay, this);
            this.b = viewGroup;
            TextView textView = (TextView) viewGroup.findViewById(R.id.minimize_survey);
            ViewGroup viewGroup2 = (ViewGroup) this.b.findViewById(R.id.normal_survey);
            this.c = viewGroup2;
            this.g = (TextView) viewGroup2.findViewById(R.id.survey_question);
            this.i = akf.a(context, 2131233107);
            this.j = akf.a(context, 2131233110);
            this.h = (TextView) this.c.findViewById(R.id.survey_attribution);
            this.k = new xhk(this.h);
            this.d = new TextView[]{(TextView) this.c.findViewById(R.id.survey_answer_1), (TextView) this.c.findViewById(R.id.survey_answer_2), (TextView) this.c.findViewById(R.id.survey_answer_3), (TextView) this.c.findViewById(R.id.survey_answer_4), (TextView) this.c.findViewById(R.id.survey_answer_5)};
            View findViewById = this.c.findViewById(R.id.skip_button);
            this.e = findViewById;
            findViewById.setOnClickListener(this);
            this.e.setOnTouchListener(this);
            View findViewById2 = this.c.findViewById(R.id.submit_button);
            this.f = findViewById2;
            findViewById2.setOnClickListener(this);
            int i = 0;
            while (true) {
                TextView[] textViewArr = this.d;
                int length = textViewArr.length;
                if (i >= 5) {
                    break;
                }
                textViewArr[i].setOnClickListener(this);
                i++;
            }
            textView.setVisibility(8);
            this.c.setVisibility(0);
            this.h.setOnClickListener(new xfq(this));
        }
        f();
    }

    private final void e() {
        if (this.a == null) {
            return;
        }
        int[] iArr = new int[this.m];
        int i = 0;
        for (int i2 = 0; i2 < this.m; i2++) {
            if (i(i2)) {
                iArr[i] = i2;
                i++;
            }
        }
        this.a.b(Arrays.copyOf(iArr, i));
    }

    private final void h() {
        int i;
        boolean z;
        int i2 = 0;
        this.n = false;
        int i3 = 0;
        while (true) {
            i = this.m;
            z = true;
            if (i3 >= i) {
                break;
            }
            if (!this.n && !i(i3)) {
                z = false;
            }
            this.n = z;
            i3++;
        }
        if (!this.n && (!this.l || !i(i))) {
            z = false;
        }
        this.n = z;
        if (this.b != null) {
            this.f.setVisibility((!z || !this.l) ? 8 : 0);
            View view = this.e;
            if (!this.o || this.n) {
                i2 = 8;
            }
            view.setVisibility(i2);
        }
    }

    private final boolean i(int i) {
        if (this.b == null) {
            return false;
        }
        TextView[] textViewArr = this.d;
        int length = textViewArr.length;
        return i < 5 && textViewArr[i].isSelected();
    }

    protected final void a(int i, boolean z) {
        if (this.b != null) {
            TextView[] textViewArr = this.d;
            int length = textViewArr.length;
            if (i >= 5) {
                return;
            }
            textViewArr[i].setSelected(z);
            if (this.l) {
                kz.u(this.d[i], null, null, z ? this.i : this.j);
            } else {
                this.d[i].setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            }
        }
    }

    @Override // defpackage.aizf
    public final ViewGroup.LayoutParams c() {
        return new ViewGroup.LayoutParams(-1, -1);
    }

    @Override // defpackage.xge
    public final void d() {
        this.o = true;
        h();
    }

    @Override // defpackage.xge
    public final void f() {
        ViewGroup viewGroup = this.b;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
            this.k.a();
            this.e.setVisibility(8);
            this.f.setVisibility(8);
        }
        this.n = false;
        this.o = false;
        this.p = 0;
        this.q = 0;
        setVisibility(8);
    }

    @Override // defpackage.xge
    public final void g(xgd xgdVar) {
        this.a = xgdVar;
    }

    @Override // defpackage.xge
    public final void j(boolean z) {
        setVisibility(true != z ? 8 : 0);
    }

    @Override // defpackage.xge
    public final void k() {
        this.k.b(true, false);
    }

    @Override // defpackage.xge
    public final void l(int i) {
        if (this.b == null) {
            return;
        }
        this.h.setText(this.b.getResources().getString(R.string.survey_attribution, zgh.i((int) Math.ceil(i / 1000.0f))));
    }

    @Override // defpackage.xge
    public final void o(String str, List list, boolean z, int i) {
        f();
        this.l = z;
        this.m = list.size();
        this.g.setText(str);
        int size = list.size();
        int i2 = 0;
        while (true) {
            int length = this.d.length;
            if (i2 < 5) {
                if (i2 < list.size()) {
                    this.d[i2].setText((CharSequence) list.get(i2));
                    this.d[i2].setVisibility(0);
                } else if (i2 != size || !z) {
                    this.d[i2].setVisibility(4);
                } else {
                    this.d[i2].setText(R.string.survey_none_of_the_above);
                    this.d[i2].setVisibility(0);
                }
                a(i2, false);
                i2++;
            } else {
                this.b.setVisibility(0);
                return;
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == this.e) {
            xgd xgdVar = this.a;
            if (xgdVar == null) {
                return;
            }
            xgdVar.c(this.p, this.q);
        } else if (view == this.f) {
            e();
        } else {
            int i = 0;
            while (true) {
                TextView[] textViewArr = this.d;
                int length = textViewArr.length;
                if (i >= 5) {
                    return;
                }
                if (view == textViewArr[i]) {
                    boolean z = !view.isSelected();
                    a(i, z);
                    if (this.l) {
                        if (z) {
                            int i2 = this.m;
                            if (i < i2) {
                                a(i2, false);
                            } else {
                                for (int i3 = 0; i3 < this.m; i3++) {
                                    a(i3, false);
                                }
                            }
                        }
                        h();
                    } else {
                        e();
                    }
                }
                i++;
            }
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            this.p = (int) motionEvent.getRawX();
            this.q = (int) motionEvent.getRawY();
            return false;
        }
        return false;
    }

    @Override // defpackage.xge
    public final kiu p() {
        return null;
    }
}
