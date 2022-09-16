package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.google.android.libraries.youtube.logging.interaction.InteractionLoggingScreen;
import java.util.Map;
/* compiled from: PG */
/* renamed from: esf  reason: default package */
/* loaded from: classes3.dex */
public final class esf implements aafl {
    public final Activity a;
    private final acti b;
    private final yjk c;

    public esf(Activity activity, yjk yjkVar, acti actiVar) {
        this.a = activity;
        this.c = yjkVar;
        this.b = actiVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        this.b.d(acuo.a(18046), apzgVar, null);
        ((acsx) this.b).D(new acte(acuo.b(22163)));
        Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT", (Uri) null);
        intent.putExtra("android.intent.extra.LOCAL_ONLY", true);
        intent.setType("video/*");
        intent.addCategory("android.intent.category.OPENABLE");
        Intent addFlags = intent.putExtra("android.intent.extra.MIME_TYPES", new String[]{"video/*"}).addFlags(64).addFlags(1);
        InteractionLoggingScreen interactionLoggingScreen = ((acsx) this.b).i;
        String str = interactionLoggingScreen.a;
        int i = interactionLoggingScreen.f;
        aopc aopcVar = (aopc) apzg.a.createBuilder();
        aopa createBuilder = atnp.a.createBuilder();
        createBuilder.copyOnWrite();
        atnp atnpVar = (atnp) createBuilder.instance;
        atnpVar.b |= 2;
        atnpVar.d = i;
        if (str != null) {
            createBuilder.copyOnWrite();
            atnp atnpVar2 = (atnp) createBuilder.instance;
            atnpVar2.b = 1 | atnpVar2.b;
            atnpVar2.c = str;
        }
        aopcVar.e(atno.b, (atnp) createBuilder.mo39build());
        yjk yjkVar = this.c;
        final apzg apzgVar2 = (apzg) aopcVar.mo39build();
        yjkVar.a(addFlags, 901, new yiu() { // from class: ese
            @Override // defpackage.yiu
            public final void kC(int i2, int i3, Intent intent2) {
                Intent J2;
                esf esfVar = esf.this;
                apzg apzgVar3 = apzgVar2;
                if (i2 == 901 && i3 == -1 && (J2 = arey.J(esfVar.a, intent2)) != null) {
                    J2.putExtra("navigation_endpoint", apzgVar3.toByteArray());
                    esfVar.a.startActivityForResult(J2, 902);
                }
            }
        });
    }
}
