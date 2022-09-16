package defpackage;

import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bjbq  reason: default package */
/* loaded from: classes3.dex */
public class bjbq implements bjbn {
    private final String a;
    private final Runnable b;
    private final cjta c;

    public bjbq(gga ggaVar, final bjbu bjbuVar, final bjhc bjhcVar, final ilo iloVar) {
        this.a = ggaVar.getString(R.string.PLACE_QA_ASK_NOW_BUTTON);
        this.b = new Runnable(bjhcVar, bjbuVar, iloVar) { // from class: bjbo
            private final bjhc a;
            private final bjbu b;
            private final ilo c;

            {
                this.a = bjhcVar;
                this.b = bjbuVar;
                this.c = iloVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bjhc bjhcVar2 = this.a;
                final bjbu bjbuVar2 = this.b;
                final ilo iloVar2 = this.c;
                bjhcVar2.c(new Runnable(bjbuVar2, iloVar2) { // from class: bjbp
                    private final bjbu a;
                    private final ilo b;

                    {
                        this.a = bjbuVar2;
                        this.b = iloVar2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.b(this.b);
                    }
                });
            }
        };
        this.c = bjgr.d(iloVar);
    }

    @Override // defpackage.bjbn
    public CharSequence a() {
        return this.a;
    }

    @Override // defpackage.bjbn
    public cqkl b() {
        this.b.run();
        return cqkl.a;
    }

    @Override // defpackage.bjbn
    public cjtd c(ddho ddhoVar) {
        return this.c.b(ddhoVar);
    }
}
