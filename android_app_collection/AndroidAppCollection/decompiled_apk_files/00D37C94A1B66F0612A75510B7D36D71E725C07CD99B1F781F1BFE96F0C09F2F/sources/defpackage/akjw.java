package defpackage;

import android.content.Context;
import android.support.v7.widget.AppCompatImageView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: akjw  reason: default package */
/* loaded from: classes.dex */
public final class akjw extends ajsl {
    public final RadioButton a;
    private final View b;
    private final AppCompatImageView c;
    private final ajxz d;

    public akjw(Context context, ajxz ajxzVar) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.subscription_notification_primary_option, (ViewGroup) null);
        this.b = inflate;
        this.a = (RadioButton) inflate.findViewById(R.id.radio);
        this.c = (AppCompatImageView) inflate.findViewById(R.id.icon);
        this.d = ajxzVar;
        inflate.setOnClickListener(new View.OnClickListener() { // from class: akju
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                akjw.this.a.toggle();
            }
        });
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.b;
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ void d(ajrs ajrsVar, Object obj) {
        String str;
        arag aragVar;
        final avbp avbpVar = (avbp) obj;
        RadioButton radioButton = this.a;
        aovs aovsVar = avbpVar.i;
        if (aovsVar == null) {
            aovsVar = aovs.a;
        }
        aovr aovrVar = aovsVar.c;
        if (aovrVar == null) {
            aovrVar = aovr.a;
        }
        if ((aovrVar.b & 2) != 0) {
            aovs aovsVar2 = avbpVar.i;
            if (aovsVar2 == null) {
                aovsVar2 = aovs.a;
            }
            aovr aovrVar2 = aovsVar2.c;
            if (aovrVar2 == null) {
                aovrVar2 = aovr.a;
            }
            str = aovrVar2.c;
        } else {
            str = null;
        }
        radioButton.setContentDescription(str);
        RadioButton radioButton2 = this.a;
        if ((avbpVar.b & 1) != 0) {
            aragVar = avbpVar.c;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        radioButton2.setText(ajgl.b(aragVar));
        final akjt akjtVar = (akjt) ajrsVar.c(akjt.o);
        if ((avbpVar.b & 2) == 0) {
            this.c.setVisibility(8);
        } else {
            AppCompatImageView appCompatImageView = this.c;
            ajxz ajxzVar = this.d;
            arhs arhsVar = avbpVar.d;
            if (arhsVar == null) {
                arhsVar = arhs.a;
            }
            arhr b = arhr.b(arhsVar.c);
            if (b == null) {
                b = arhr.UNKNOWN;
            }
            appCompatImageView.setImageResource(ajxzVar.a(b));
            kw.h(this.c, zhn.f(this.b.getContext(), true != akjtVar.f(avbpVar) ? R.attr.ytIconInactive : R.attr.ytCallToAction));
            this.c.setVisibility(0);
        }
        this.a.setOnCheckedChangeListener(null);
        this.a.setChecked(akjtVar.f(avbpVar));
        this.a.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: akjv
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                akjt.this.c(avbpVar, z);
            }
        });
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((avbp) obj).h.I();
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.a.setOnCheckedChangeListener(null);
    }
}
