package defpackage;

import android.text.TextUtils;
import android.widget.Toast;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: ackl  reason: default package */
/* loaded from: classes.dex */
final class ackl implements abzg {
    final /* synthetic */ ackp a;

    public ackl(ackp ackpVar) {
        this.a = ackpVar;
    }

    @Override // defpackage.abzg
    public final void a(arsg arsgVar) {
        if ((arsgVar.b & 4) != 0) {
            atvd b = atvd.b(arsgVar.f);
            if (b == null) {
                b = atvd.PARTICIPANT_JOIN_STATE_UNKNOWN;
            }
            if (b == atvd.PARTICIPANT_JOIN_STATE_UNKNOWN) {
                b = atvd.PARTICIPANT_JOIN_STATE_PREJOIN;
            }
            ackp ackpVar = this.a;
            if (!TextUtils.isEmpty(ackpVar.ao)) {
                aopa createBuilder = atvc.a.createBuilder();
                String str = ackpVar.ao;
                createBuilder.copyOnWrite();
                atvc atvcVar = (atvc) createBuilder.instance;
                str.getClass();
                atvcVar.b |= 1;
                atvcVar.c = str;
                createBuilder.copyOnWrite();
                atvc atvcVar2 = (atvc) createBuilder.instance;
                atvcVar2.d = b.f;
                atvcVar2.b |= 2;
                atvb b2 = new atuz(((atvc) createBuilder.mo39build()).mo52toBuilder()).b();
                aajs c = ackpVar.an.c();
                c.d(b2);
                c.b().Q();
            }
            if (b == atvd.PARTICIPANT_JOIN_STATE_WAITING) {
                ackp ackpVar2 = this.a;
                ackpVar2.a.postDelayed(ackpVar2.aj, 1000L);
            }
            if (b != atvd.PARTICIPANT_JOIN_STATE_APPROVED) {
                return;
            }
            ackp ackpVar3 = this.a;
            aunb aunbVar = arsgVar.g;
            if (aunbVar == null) {
                aunbVar = aunb.a;
            }
            if (!aunbVar.qn(athx.a)) {
                return;
            }
            aunb aunbVar2 = arsgVar.h;
            if (aunbVar2 == null) {
                aunbVar2 = aunb.a;
            }
            if (!aunbVar2.qn(asui.a)) {
                return;
            }
            aunb aunbVar3 = arsgVar.h;
            if (aunbVar3 == null) {
                aunbVar3 = aunb.a;
            }
            asuh asuhVar = (asuh) aunbVar3.qm(asui.a);
            String str2 = asuhVar.b;
            String str3 = asuhVar.c;
            if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
                Toast.makeText(ackpVar3.rb(), (int) R.string.lc_add_participant_failed, 1).show();
            }
            aunb aunbVar4 = arsgVar.g;
            if (aunbVar4 == null) {
                aunbVar4 = aunb.a;
            }
            ackpVar3.e.ai((aths) aunbVar4.qm(athx.a), str2, str3);
        }
    }

    @Override // defpackage.abzg
    public final void b(int i, aqft aqftVar) {
        if (i != 4) {
            ackp ackpVar = this.a;
            ackpVar.a.postDelayed(ackpVar.aj, 1000L);
        } else if (aqftVar != null) {
            this.a.s(aqftVar);
        } else {
            Toast.makeText(this.a.rb(), (int) R.string.lc_add_participant_failed, 1).show();
        }
    }
}
