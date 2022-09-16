package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: gca  reason: default package */
/* loaded from: classes6.dex */
public class gca implements gbu {
    public final btvo a;
    private final gga b;
    private final dxio<afha> c;

    public gca(gga ggaVar, btvo btvoVar, dxio<afha> dxioVar) {
        this.b = ggaVar;
        this.a = btvoVar;
        this.c = dxioVar;
    }

    @Override // defpackage.gbu
    public View.OnClickListener a() {
        return new View.OnClickListener(this) { // from class: gbv
            private final gca a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                gca gcaVar = this.a;
                gcaVar.f(cjxr.m(gcaVar.a));
            }
        };
    }

    @Override // defpackage.gbu
    public View.OnClickListener b() {
        return new View.OnClickListener(this) { // from class: gbw
            private final gca a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                gca gcaVar = this.a;
                gcaVar.f(cjxr.n(gcaVar.a));
            }
        };
    }

    @Override // defpackage.gbu
    public View.OnClickListener c() {
        return new View.OnClickListener(this) { // from class: gbx
            private final gca a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                gca gcaVar = this.a;
                gcaVar.f(cjxr.o(gcaVar.a));
            }
        };
    }

    @Override // defpackage.gbu
    public View.OnClickListener d() {
        return new View.OnClickListener(this) { // from class: gby
            private final gca a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                gca gcaVar = this.a;
                gcaVar.f(cjxr.p(gcaVar.a));
            }
        };
    }

    @Override // defpackage.gbu
    public cqsn e() {
        Locale locale = Locale.getDefault();
        return cqsk.a(this.b.getString(R.string.DIALOG_BODY, new Object[]{String.format(locale, "%,d", 100000), String.format(locale, "%,d", 7)}));
    }

    public final void f(String str) {
        this.c.a().m(str, 1);
    }

    public View.OnClickListener g() {
        return new View.OnClickListener(this) { // from class: gbz
            private final gca a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                gca gcaVar = this.a;
                gcaVar.f(cjxr.q(gcaVar.a));
            }
        };
    }
}
