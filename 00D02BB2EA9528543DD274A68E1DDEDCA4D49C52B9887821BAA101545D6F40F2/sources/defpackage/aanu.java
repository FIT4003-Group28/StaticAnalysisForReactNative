package defpackage;

import android.text.SpannableStringBuilder;
import android.view.View;
import com.google.android.apps.gmm.majorevents.api.MajorEvent;
/* compiled from: PG */
/* renamed from: aanu  reason: default package */
/* loaded from: classes2.dex */
public class aanu implements aanj {
    public final dxio<akge> a;
    public MajorEvent b;
    private final btvo c;

    public aanu(dxio<akge> dxioVar, btvo btvoVar) {
        aknt akntVar = aknt.MINIMAL;
        diug diugVar = (diug) diwb.U.bZ();
        if (diugVar.c) {
            diugVar.bF();
            diugVar.c = false;
        }
        diwb diwbVar = (diwb) diugVar.b;
        diwbVar.a |= 1;
        diwbVar.c = "";
        this.b = new MajorEvent(akntVar, (diwb) diugVar.bK());
        this.a = dxioVar;
        this.c = btvoVar;
    }

    @Override // defpackage.aanj
    public CharSequence a() {
        diup diupVar = this.b.g().b;
        if (diupVar == null) {
            diupVar = diup.d;
        }
        return diupVar.a;
    }

    @Override // defpackage.aanj
    public Boolean b() {
        diup diupVar = this.b.g().b;
        if (diupVar == null) {
            diupVar = diup.d;
        }
        return Boolean.valueOf(diupVar.b.length() > 0);
    }

    @Override // defpackage.aakt
    public Boolean c() {
        boolean z = true;
        if ((this.b.g().a & 1) == 0 && !l().booleanValue()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.aanj
    public CharSequence d() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        diup diupVar = this.b.g().b;
        if (diupVar == null) {
            diupVar = diup.d;
        }
        return spannableStringBuilder.append((CharSequence) diupVar.b);
    }

    @Override // defpackage.aanj
    public View.OnClickListener e() {
        return new View.OnClickListener(this) { // from class: aans
            private final aanu a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                aanu aanuVar = this.a;
                if (aanuVar.k().booleanValue()) {
                    aanuVar.a.a().a(aanuVar.b);
                }
            }
        };
    }

    @Override // defpackage.aanj
    public View.OnClickListener f() {
        return new View.OnClickListener(this) { // from class: aant
            private final aanu a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                aanu aanuVar = this.a;
                aanuVar.a.a().b(aanuVar.b, dnqb.EXPERIENCE_EVENT_DISRUPTION_MODULE);
            }
        };
    }

    @Override // defpackage.aanj
    public cjtd g() {
        cjta b = cjtd.b();
        b.d = dtxo.aG;
        if (this.b.c()) {
            b.g(this.b.d());
        }
        return b.a();
    }

    @Override // defpackage.aanj
    public cjtd h() {
        cjta b = cjtd.b();
        b.d = dtxo.aF;
        if (this.b.c()) {
            b.g(this.b.d());
        }
        return b.a();
    }

    @Override // defpackage.aanj
    public cjtd i() {
        cjta b = cjtd.b();
        b.d = dtxo.bZ;
        if (this.b.c()) {
            b.g(this.b.d());
        }
        return b.a();
    }

    @Override // defpackage.aanj
    public CharSequence j() {
        diup diupVar = this.b.g().b;
        if (diupVar == null) {
            diupVar = diup.d;
        }
        return diupVar.c;
    }

    @Override // defpackage.aanj
    public Boolean k() {
        diuv diuvVar = this.b.g().c;
        if (diuvVar == null) {
            diuvVar = diuv.g;
        }
        return Boolean.valueOf(diuvVar.b.size() > 0);
    }

    @Override // defpackage.aanj
    public Boolean l() {
        boolean z = false;
        if (this.c.getEventsUgcParameters().i && this.b.g().d) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public void m(diwb diwbVar) {
        this.b = akgc.a(diwbVar);
    }
}
