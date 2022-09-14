package defpackage;

import android.util.Pair;
import com.google.android.libraries.messaging.lighter.model.ContactId;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import com.google.android.libraries.messaging.lighter.model.Notification;
import java.util.List;
/* compiled from: PG */
/* renamed from: cusm  reason: default package */
/* loaded from: classes5.dex */
public interface cusm {
    void A(ConversationId conversationId, List<String> list, List<cugo> list2, cugo cugoVar);

    void B(dcdc<cugu> dcdcVar);

    dcdc<String> C(ConversationId conversationId, cugo cugoVar, long j);

    dcdn<ConversationId, dcdc<String>> H(long j);

    void I(List<String> list);

    void J(List<cutf> list);

    void K(cutf cutfVar, boolean z);

    cuss<cuey> L(cutf cutfVar);

    void M(ConversationId conversationId, List<ContactId> list);

    void O(ConversationId conversationId, List<ContactId> list);

    void P(Notification notification);

    void Q(dcdc<String> dcdcVar);

    long R(ConversationId conversationId);

    long S();

    void T();

    boolean a(String str);

    cuss<Pair<dcdc<cufw>, Boolean>> am(int i, int i2, dbsl<cufw> dbslVar);

    cuss<dcdc<cufp>> an(int i, int i2);

    cuss<Pair<dcdc<cufp>, Boolean>> ao(dbsl<cufp> dbslVar);

    cuss<dcdc<cufj>> ap(ConversationId conversationId);

    cuss<Integer> aq(ConversationId conversationId);

    void ar(cufj cufjVar);

    void as(cufp cufpVar);

    void at(cufp cufpVar);

    void au(ConversationId conversationId, long j, long j2);

    cuss<dcdc<Notification>> av();

    boolean b(String str, cugo cugoVar);

    boolean c(ConversationId conversationId, dcdc<Integer> dcdcVar, long j);

    Pair<Boolean, Boolean> d(cuib cuibVar);

    void e(cugu cuguVar);

    void f(cugu cuguVar);

    void h(ConversationId conversationId, cufh... cufhVarArr);

    void i(ConversationId conversationId, String... strArr);

    void j(ConversationId conversationId, long j);

    int k(long j, long j2);

    void l(cugu... cuguVarArr);

    cuss<Integer> n(dbsl<cufw> dbslVar, Integer num);

    cuss<dcdc<cugu>> p(ConversationId conversationId, int i, int i2, cugt[] cugtVarArr);

    cuss<dbsg<cugu>> q(String str, ConversationId conversationId);

    cuss<dbsg<cufp>> r(ConversationId conversationId);

    void t(ConversationId conversationId);

    cuss<dbsg<cufj>> u(ContactId contactId);

    long v(cufj cufjVar);

    cuss<Integer> w(cugo cugoVar);

    void x(cugu cuguVar, long j);

    void y(List<cugu> list, cugo cugoVar, cugo cugoVar2);

    dcdc<String> z(ConversationId conversationId, cugo cugoVar, cugo cugoVar2);
}
