package defpackage;

import android.app.Activity;
import com.google.android.libraries.youtube.infocards.factories.InfoCardCollection;
/* compiled from: PG */
/* renamed from: jxy  reason: default package */
/* loaded from: classes3.dex */
public final class jxy {
    public final azqb a;
    public jxt b;
    private final Activity c;

    public jxy(Activity activity, aacz aaczVar, azqb azqbVar) {
        this.c = activity;
        this.a = azqbVar;
        if (eog.aF(aaczVar)) {
            ((aaar) azqbVar.get()).f.R().as(new ayqb() { // from class: jxx
                @Override // defpackage.ayqb
                public final void a(Object obj) {
                    jxy jxyVar = jxy.this;
                    boolean booleanValue = ((Boolean) obj).booleanValue();
                    if (jxyVar.b == null) {
                        jxyVar.a();
                    }
                    InfoCardCollection infoCardCollection = ((aaar) jxyVar.a.get()).g;
                    if (!booleanValue || infoCardCollection == null) {
                        jxt jxtVar = jxyVar.b;
                        jxtVar.c = "";
                        jxtVar.g(false);
                        return;
                    }
                    jxyVar.b.c = infoCardCollection.a().toString();
                    jxyVar.b.g(true);
                }
            });
        }
    }

    public final void a() {
        final aaar aaarVar = (aaar) this.a.get();
        aaarVar.getClass();
        jxt jxtVar = new jxt("", new jxs() { // from class: jxw
            @Override // defpackage.jxs
            public final void a() {
                aaar.this.g();
            }
        });
        this.b = jxtVar;
        jxtVar.g(false);
        this.b.e = akf.a(this.c, 2131232544);
    }
}
