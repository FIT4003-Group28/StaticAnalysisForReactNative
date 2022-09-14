package defpackage;

import android.graphics.Bitmap;
import android.view.View;
import com.google.android.apps.maps.R;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: aaxg  reason: default package */
/* loaded from: classes2.dex */
public class aaxg implements aawn {
    public final dxio<aaap> a;
    public final dxio<ache> b;
    public final dxio<aaps> c;
    public final btvo d;
    public final Executor e;
    public diwb f;
    private final gga g;
    private boolean h;

    public aaxg(gga ggaVar, dxio<ache> dxioVar, dxio<aaps> dxioVar2, dxio<aaap> dxioVar3, btvo btvoVar, Executor executor) {
        this.g = ggaVar;
        this.a = dxioVar3;
        this.b = dxioVar;
        this.c = dxioVar2;
        this.d = btvoVar;
        this.e = executor;
    }

    @Override // defpackage.idl
    public CharSequence Pb() {
        return this.g.getResources().getText(R.string.SEND_FEEDBACK_CARD_BUTTON);
    }

    @Override // defpackage.idl
    public CharSequence a() {
        return this.g.getResources().getText(R.string.SEND_FEEDBACK_CARD_TITLE);
    }

    @Override // defpackage.idl
    public CharSequence b() {
        return this.g.getResources().getText(R.string.SEND_FEEDBACK_CARD_SUBTEXT);
    }

    @Override // defpackage.aakt
    public Boolean c() {
        return Boolean.valueOf(this.h);
    }

    public void d(diwb diwbVar) {
        this.h = true;
        this.f = diwbVar;
    }

    @Override // defpackage.idl
    public cjtd e() {
        cjta b = cjtd.b();
        b.d = dtxo.bI;
        diwb diwbVar = this.f;
        if (diwbVar != null) {
            ditt dittVar = diwbVar.e;
            if (dittVar == null) {
                dittVar = ditt.n;
            }
            if (!dittVar.b.isEmpty()) {
                ditt dittVar2 = this.f.e;
                if (dittVar2 == null) {
                    dittVar2 = ditt.n;
                }
                b.g(dittVar2.b);
            }
        }
        return b.a();
    }

    @Override // defpackage.idl
    public View.OnClickListener f() {
        return new View.OnClickListener(this) { // from class: aaxd
            private final aaxg a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                drlp drlpVar;
                diwb diwbVar;
                final aaxg aaxgVar = this.a;
                dupy eventsUgcParameters = aaxgVar.d.getEventsUgcParameters();
                diwb diwbVar2 = aaxgVar.f;
                if (diwbVar2 == null || (diwbVar2.b & 1) == 0) {
                    drlpVar = eventsUgcParameters.g;
                    if (drlpVar == null) {
                        drlpVar = drlp.b;
                    }
                } else {
                    drlpVar = diwbVar2.D;
                    if (drlpVar == null) {
                        drlpVar = drlp.b;
                    }
                }
                if (!eventsUgcParameters.h || drlpVar.a.size() <= 0 || (diwbVar = aaxgVar.f) == null || diwbVar.c.isEmpty()) {
                    aaxgVar.c.a().a(aaxgVar.f, null, true);
                } else {
                    aaxgVar.b.a().B(new achf(aaxgVar) { // from class: aaxe
                        private final aaxg a;

                        {
                            this.a = aaxgVar;
                        }

                        @Override // defpackage.achf
                        public final void a(final Bitmap bitmap) {
                            final aaxg aaxgVar2 = this.a;
                            aaxgVar2.e.execute(new Runnable(aaxgVar2, bitmap) { // from class: aaxf
                                private final aaxg a;
                                private final Bitmap b;

                                {
                                    this.a = aaxgVar2;
                                    this.b = bitmap;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    aaxg aaxgVar3 = this.a;
                                    aaxgVar3.a.a().l(aaxgVar3.f, this.b);
                                }
                            });
                        }
                    });
                }
            }
        };
    }

    @Override // defpackage.idl
    public View.OnClickListener g() {
        return idk.a;
    }

    @Override // defpackage.idl
    public Boolean h() {
        return idj.a();
    }

    public void i() {
        this.h = true;
        this.f = diwb.U;
    }
}
