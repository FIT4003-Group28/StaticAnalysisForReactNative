package defpackage;

import android.content.Context;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: akjz  reason: default package */
/* loaded from: classes.dex */
public final class akjz extends ajsl {
    public final CheckBox a;
    public String b;
    private final View c;

    public akjz(Context context) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.subscription_notification_secondary_option, (ViewGroup) null);
        this.c = inflate;
        CheckBox checkBox = (CheckBox) inflate.findViewById(R.id.checkbox);
        this.a = checkBox;
        checkBox.setClickable(false);
        inflate.setOnClickListener(new View.OnClickListener() { // from class: akjx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                akjz.this.a.toggle();
            }
        });
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.c;
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ void d(ajrs ajrsVar, Object obj) {
        arag aragVar;
        avbq avbqVar = (avbq) obj;
        int i = avbqVar.b;
        String str = (i & 32) != 0 ? avbqVar.f : null;
        str.getClass();
        this.b = str;
        if ((i & 4) != 0) {
            aragVar = avbqVar.d;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        Spanned b = ajgl.b(aragVar);
        this.a.setText(b);
        this.a.setContentDescription(b);
        final akjt akjtVar = (akjt) ajrsVar.c(akjt.o);
        this.a.setOnCheckedChangeListener(null);
        if (akjtVar.d()) {
            this.c.setEnabled(false);
            this.c.setAlpha(0.5f);
            this.a.setEnabled(false);
            this.a.setChecked(false);
        } else {
            this.c.setEnabled(true);
            this.c.setAlpha(1.0f);
            this.a.setEnabled(true);
            this.a.setChecked(akjtVar.e(this.b));
        }
        this.a.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: akjy
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                akjtVar.a(akjz.this.b, z);
            }
        });
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((avbq) obj).c.I();
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.b = null;
        this.a.setOnCheckedChangeListener(null);
    }
}
