package defpackage;

import com.google.android.filament.R;
import com.google.android.libraries.messaging.lighter.model.ContactId;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.List;
/* compiled from: PG */
/* renamed from: ctuq  reason: default package */
/* loaded from: classes5.dex */
public final class ctuq {
    public static ConversationId a(ctyy ctyyVar, dxmq dxmqVar) {
        dxnt dxntVar;
        dxmk dxmkVar;
        dxmk dxmkVar2;
        ContactId e = ctyyVar.b().e();
        int i = dxmqVar.c;
        char c = 2;
        if (i != 0) {
            c = i != 1 ? i != 2 ? (char) 0 : (char) 4 : (char) 3;
        }
        if (c == 0 || c != 4) {
            if (dxmqVar.a == 101) {
                dxntVar = (dxnt) dxmqVar.b;
            } else {
                dxntVar = dxnt.b;
            }
            List k = dchl.k(dxntVar.a, ctup.a);
            cufq f = ConversationId.f();
            f.e((ContactId) dcgh.j(k.iterator(), dbst.a(dbst.c(e))));
            f.c(ctyyVar.b().e());
            return f.a();
        }
        cufq f2 = ConversationId.f();
        cufr c2 = ConversationId.GroupId.c();
        if (dxmqVar.a == 103) {
            dxmkVar = (dxmk) dxmqVar.b;
        } else {
            dxmkVar = dxmk.c;
        }
        c2.c(dxmkVar.a);
        if (dxmqVar.a == 103) {
            dxmkVar2 = (dxmk) dxmqVar.b;
        } else {
            dxmkVar2 = dxmk.c;
        }
        c2.b(dxmkVar2.b);
        f2.d(c2.a());
        f2.c(e);
        return f2.a();
    }

    public static dxmq b(ConversationId conversationId) {
        if (conversationId.c() == ConversationId.IdType.GROUP) {
            dxmp bZ = dxmq.d.bZ();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ((dxmq) bZ.b).c = dxot.a(4);
            dxmj bZ2 = dxmk.c.bZ();
            String a = conversationId.d().a();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            a.getClass();
            ((dxmk) bZ2.b).a = a;
            String b = conversationId.d().b();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            b.getClass();
            ((dxmk) bZ2.b).b = b;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dxmq dxmqVar = (dxmq) bZ.b;
            dxmk bK = bZ2.bK();
            bK.getClass();
            dxmqVar.b = bK;
            dxmqVar.a = R.styleable.AppCompatTheme_textAppearanceListItem;
            return bZ.bK();
        }
        dxnc a2 = ctus.a(conversationId.a());
        dxnc a3 = ctus.a(conversationId.e());
        dxmp bZ3 = dxmq.d.bZ();
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        ((dxmq) bZ3.b).c = dxot.a(3);
        dxns bZ4 = dxnt.b.bZ();
        bZ4.a(a2);
        bZ4.a(a3);
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dxmq dxmqVar2 = (dxmq) bZ3.b;
        dxnt bK2 = bZ4.bK();
        bK2.getClass();
        dxmqVar2.b = bK2;
        dxmqVar2.a = R.styleable.AppCompatTheme_switchStyle;
        return bZ3.bK();
    }
}
