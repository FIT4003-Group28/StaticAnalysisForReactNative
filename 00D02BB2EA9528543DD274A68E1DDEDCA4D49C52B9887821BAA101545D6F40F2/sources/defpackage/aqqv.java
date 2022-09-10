package defpackage;

import android.content.Intent;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: aqqv  reason: default package */
/* loaded from: classes.dex */
public final class aqqv extends afhx {
    public static final dbsl<afga> a = aqqu.a;
    private final dxio<apyz> b;
    private final dxio<ckcw> c;
    private final dxio<cjqy> d;

    public aqqv(Intent intent, @dzsi String str, dxio<apyz> dxioVar, dxio<ckcw> dxioVar2, dxio<cjqy> dxioVar3) {
        super(intent, str, afid.BUSINESS_MESSAGING_GCM_NOTIFICATION);
        this.b = dxioVar;
        this.c = dxioVar2;
        this.d = dxioVar3;
    }

    @Override // defpackage.afhx
    public final void a() {
        String concat;
        ConversationId conversationId = (ConversationId) this.f.getParcelableExtra("ConversationIdExtraKey");
        if (conversationId == null) {
            this.b.a().f();
            return;
        }
        ((ckhe) this.c.a().a(ckgs.c)).a();
        apza i = apzc.i();
        i.b(conversationId);
        i.d(apzb.NOTIFICATION);
        this.b.a().n(i.e(), true);
        Intent intent = this.f;
        if (conversationId.c() == ConversationId.IdType.ONE_TO_ONE) {
            concat = conversationId.e().a();
        } else {
            String valueOf = String.valueOf(conversationId.d().a());
            concat = valueOf.length() != 0 ? "group:".concat(valueOf) : new String("group:");
        }
        String stringExtra = intent.getStringExtra("ServerRegistrationIdExtraKey");
        String[] stringArrayExtra = intent.getStringArrayExtra("MessageIdExtraKey");
        ddcg bZ = ddcj.g.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddcj ddcjVar = (ddcj) bZ.b;
        concat.getClass();
        int i2 = 1 | ddcjVar.a;
        ddcjVar.a = i2;
        ddcjVar.b = concat;
        if (stringExtra != null) {
            stringExtra.getClass();
            ddcjVar.a = i2 | 4;
            ddcjVar.d = stringExtra;
        }
        if (stringArrayExtra != null) {
            bZ.a(Arrays.asList(stringArrayExtra));
        }
        cjqy a2 = this.d.a();
        cjst d = cjsu.d();
        d.d(ddda.aW);
        cjry e = cjrz.e();
        e.b(ddcu.m);
        ddzf bZ2 = ddzg.t.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        ddzg ddzgVar = (ddzg) bZ2.b;
        ddcj bK = bZ.bK();
        bK.getClass();
        ddzgVar.o = bK;
        ddzgVar.b |= 32768;
        ((cjrn) e).a = bZ2.bK();
        d.f(e.a());
        a2.l(d.e());
    }

    @Override // defpackage.afhx
    public final boolean b() {
        return false;
    }

    @Override // defpackage.afhx
    public final durz c() {
        return durz.EIT_BUSINESS_MESSAGING_NOTIFICATION;
    }
}
