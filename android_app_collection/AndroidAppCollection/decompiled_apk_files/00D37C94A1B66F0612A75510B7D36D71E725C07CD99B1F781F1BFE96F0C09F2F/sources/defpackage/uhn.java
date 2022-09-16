package defpackage;

import android.app.RemoteInput;
import android.os.Bundle;
import java.util.List;
/* compiled from: PG */
/* renamed from: uhn  reason: default package */
/* loaded from: classes4.dex */
public final class uhn implements uhg {
    private final uhh a;
    private final ampq b;
    private final ues c;

    public uhn(uhh uhhVar, ampq ampqVar, ues uesVar) {
        this.a = uhhVar;
        this.b = ampqVar;
        this.c = uesVar;
    }

    @Override // defpackage.uhg
    public final void a(ueb uebVar) {
        uip uipVar;
        if (uebVar.j().isEmpty()) {
            uev.b("ReplyActionEventHandler", "No threads associated with this event.", new Object[0]);
            return;
        }
        Bundle resultsFromIntent = RemoteInput.getResultsFromIntent(uebVar.b());
        if (resultsFromIntent == null) {
            uev.b("ReplyActionEventHandler", "Reply action text could not be retrieved from intent.", new Object[0]);
            return;
        }
        CharSequence charSequence = resultsFromIntent.getCharSequence("com.google.android.libraries.notifications.REPLY_TEXT_KEY");
        if (charSequence == null) {
            return;
        }
        uep a = this.c.a(aojw.ACTION_CLICK);
        ueu ueuVar = (ueu) a;
        ueuVar.w = 2;
        ueuVar.v = 2;
        a.d(uebVar.c());
        a.b((ucw) uebVar.j().get(0));
        a.i();
        uit uitVar = (uit) ((ampv) this.b).a;
        ucw ucwVar = (ucw) uebVar.j().get(0);
        charSequence.toString();
        uhh uhhVar = this.a;
        ucp c = uebVar.c();
        ucw ucwVar2 = (ucw) uebVar.j().get(0);
        ubz b = ubz.b();
        String charSequence2 = charSequence.toString();
        uip e = uebVar.e();
        if (e.b.size() == 0) {
            aopa createBuilder = uip.a.createBuilder();
            createBuilder.D(charSequence2);
            uipVar = (uip) createBuilder.mo39build();
        } else {
            aopu aopuVar = e.b;
            aopa mo52toBuilder = e.mo52toBuilder();
            mo52toBuilder.copyOnWrite();
            ((uip) mo52toBuilder.instance).b = aopi.emptyProtobufList();
            mo52toBuilder.D(charSequence2);
            mo52toBuilder.copyOnWrite();
            uip uipVar2 = (uip) mo52toBuilder.instance;
            uipVar2.a();
            aonk.addAll((Iterable) aopuVar, (List) uipVar2.b);
            uipVar = (uip) mo52toBuilder.mo39build();
        }
        uhhVar.c(c, ucwVar2, true, true, b, uipVar, null);
    }
}
