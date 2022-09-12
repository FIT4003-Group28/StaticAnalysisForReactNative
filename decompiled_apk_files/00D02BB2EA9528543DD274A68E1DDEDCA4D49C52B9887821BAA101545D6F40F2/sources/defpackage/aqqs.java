package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.libraries.messaging.lighter.model.ContactId;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
/* compiled from: PG */
/* renamed from: aqqs  reason: default package */
/* loaded from: classes2.dex */
public final class aqqs extends afhx {
    public static final dbsl<afga> a = aqqr.a;
    private final dxio<aprv> b;
    private final dxio<apyz> c;
    private final dxio<akfa> d;
    private final apzy e;
    private final apyx i;
    private final Uri j;
    private final cjqy k;

    public aqqs(Intent intent, String str, dxio<aprv> dxioVar, dxio<apyz> dxioVar2, dxio<akfa> dxioVar3, apzy apzyVar, apyx apyxVar, cjqy cjqyVar) {
        super(intent, str, afid.BUSINESS_MESSAGING_MERCHANT);
        this.c = dxioVar2;
        this.b = dxioVar;
        this.d = dxioVar3;
        this.e = apzyVar;
        this.i = apyxVar;
        this.j = afhg.b(intent);
        this.k = cjqyVar;
    }

    @Override // defpackage.afhx
    public final void a() {
        ddda dddaVar;
        this.f.getExtras();
        String str = this.j.getPathSegments().get(2);
        String queryParameter = this.j.getQueryParameter("groupId");
        String lastPathSegment = this.j.getLastPathSegment();
        if (this.i.e() && this.f.getExtras() != null) {
            Bundle extras = this.f.getExtras();
            dbsk.s(extras);
            if (extras.containsKey("NOTIFICATION_TYPE")) {
                Bundle extras2 = this.f.getExtras();
                dbsk.s(extras2);
                if (extras2.getInt("NOTIFICATION_TYPE") == 327866874) {
                    if (!this.i.e() || queryParameter == null) {
                        this.c.a().l(str, apzb.UNRESPONSIVE_MERCHANT_DAILY_SUMMARY_NOTIFICATION);
                    } else {
                        apzb apzbVar = apzb.UNRESPONSIVE_MERCHANT_DAILY_SUMMARY_NOTIFICATION;
                        btlu j = this.d.a().j();
                        ContactId b = aqda.b(this.d.a().o(), 2);
                        if (j != null && j.l() && b != null) {
                            cufq f = ConversationId.f();
                            f.c(b);
                            cufr c = ConversationId.GroupId.c();
                            c.c(queryParameter);
                            c.b("GMB");
                            f.d(c.a());
                            ConversationId a2 = f.a();
                            apza i = apzc.i();
                            i.b(a2);
                            i.d(apzbVar);
                            this.c.a().n(i.e(), true);
                        }
                    }
                    btlu j2 = this.d.a().j();
                    if (j2 == null || !j2.l()) {
                        return;
                    }
                    if (this.b.a().d(j2).size() == 1) {
                        dddaVar = ddda.aP;
                    } else {
                        dddaVar = ddda.aM;
                    }
                    ddzf bZ = ddzg.t.bZ();
                    ddii bZ2 = ddij.e.bZ();
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = false;
                    }
                    ddij ddijVar = (ddij) bZ2.b;
                    str.getClass();
                    ddijVar.a = 2 | ddijVar.a;
                    ddijVar.c = str;
                    bZ.a(bZ2.bK());
                    cjqy cjqyVar = this.k;
                    cjst d = cjsu.d();
                    d.d(dddaVar);
                    cjry e = cjrz.e();
                    e.b(ddcu.m);
                    ((cjrn) e).a = bZ.bK();
                    d.f(e.a());
                    cjqyVar.l(d.e());
                    return;
                }
            }
        }
        if (lastPathSegment == null || !lastPathSegment.equals("promo")) {
            this.c.a().l(str, apzb.NOTIFICATION);
            return;
        }
        btlu j3 = this.d.a().j();
        if (!this.e.l() || !j3.l()) {
            this.c.a().f();
            return;
        }
        String queryParameter2 = this.j.getQueryParameter("enable");
        if (this.b.a().d(j3).size() != 1) {
            this.c.a().E();
        } else if (queryParameter2 != null) {
            this.c.a().i();
        } else {
            this.c.a().f();
        }
    }

    @Override // defpackage.afhx
    public final boolean b() {
        return false;
    }

    @Override // defpackage.afhx
    public final durz c() {
        return durz.EIT_BUSINESS_MESSAGING_MERCHANT;
    }
}
