package defpackage;

import android.content.Context;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: jgo  reason: default package */
/* loaded from: classes3.dex */
public final class jgo {
    private final Context a;
    private final azqb b;
    private final jgz c;

    public jgo(Context context, azqb azqbVar, jgz jgzVar) {
        this.a = context;
        this.b = azqbVar;
        this.c = jgzVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ampq a(int i, aooq aooqVar, Object obj) {
        this.c.b(new hmv(19));
        try {
            awnn awnnVar = (awnn) aopi.parseFrom(awnn.a, this.a.getResources().openRawResource(i), aoos.b());
            awow awowVar = awnnVar.c;
            if (awowVar == null) {
                awowVar = awow.a;
            }
            awmx awmxVar = (awmx) awowVar.qm(awmx.b);
            aopa mo52toBuilder = awnnVar.mo52toBuilder();
            awow awowVar2 = awnnVar.c;
            if (awowVar2 == null) {
                awowVar2 = awow.a;
            }
            aopc aopcVar = (aopc) awowVar2.mo52toBuilder();
            aopg aopgVar = awmx.b;
            aopa mo52toBuilder2 = awmxVar.mo52toBuilder();
            awnc awncVar = awmxVar.e;
            if (awncVar == null) {
                awncVar = awnc.a;
            }
            aopc aopcVar2 = (aopc) awncVar.mo52toBuilder();
            aopcVar2.e(aooqVar, obj);
            mo52toBuilder2.copyOnWrite();
            awmx awmxVar2 = (awmx) mo52toBuilder2.instance;
            awnc awncVar2 = (awnc) aopcVar2.mo39build();
            awncVar2.getClass();
            awmxVar2.e = awncVar2;
            awmxVar2.c |= 8;
            aopcVar.e(aopgVar, (awmx) mo52toBuilder2.mo39build());
            mo52toBuilder.copyOnWrite();
            awnn awnnVar2 = (awnn) mo52toBuilder.instance;
            awow awowVar3 = (awow) aopcVar.mo39build();
            awowVar3.getClass();
            awnnVar2.c = awowVar3;
            awnnVar2.b |= 1;
            return ampq.j((awnn) mo52toBuilder.mo39build());
        } catch (IOException e) {
            zep.d("Could not load persisted element blueprint", e);
            return amon.a;
        }
    }

    public final ampq b(int i, aooq aooqVar, Object obj) {
        return a(i, aooqVar, obj).b(jgl.c);
    }

    public final void c() {
        ((yni) this.b.get()).g(this.c);
    }
}
