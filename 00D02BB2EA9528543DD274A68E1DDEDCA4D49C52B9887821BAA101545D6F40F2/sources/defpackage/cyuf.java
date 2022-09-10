package defpackage;

import com.google.android.libraries.social.populous.core.ClientConfigInternal;
import com.google.android.libraries.social.populous.core.ContactMethodField;
import com.google.android.libraries.social.populous.core.InAppNotificationTarget;
import com.google.android.libraries.social.populous.core.SessionContext;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
/* compiled from: PG */
/* renamed from: cyuf  reason: default package */
/* loaded from: classes5.dex */
final class cyuf extends dbxi<cyvs> {
    private static final cyue a = new cyue();
    private final boolean b;
    private final SessionContext c;
    private final Iterator<cyvs> d;
    private cyvs e = null;
    private Queue<cyvi> f = new LinkedList();
    private Queue<InAppNotificationTarget> g = new LinkedList();

    public cyuf(ClientConfigInternal clientConfigInternal, SessionContext sessionContext, Iterator<cyvs> it) {
        this.b = clientConfigInternal.n;
        this.c = sessionContext;
        this.d = it;
    }

    @Override // defpackage.dbxi
    protected final /* bridge */ /* synthetic */ cyvs a() {
        while (this.f.isEmpty() && this.g.isEmpty()) {
            if (!this.d.hasNext()) {
                return b();
            }
            this.f = new LinkedList();
            this.g = new LinkedList();
            cyvs next = this.d.next();
            this.e = next;
            if (this.b) {
                this.g.addAll(next.g());
            }
            this.f.addAll(this.e.a());
        }
        boolean z = true;
        int i = 0;
        if (!this.g.isEmpty()) {
            if (this.g.size() <= 0) {
                z = false;
            }
            dbsk.m(z, "No inAppNotificationTargets were found to process.");
            InAppNotificationTarget poll = this.g.poll();
            dcbg o = dcbg.b(this.e.k).o(new cyud(poll.b()));
            dcbg o2 = dcbg.b(this.e.d()).o(new cyud(poll.b()));
            cyvt a2 = cyvt.a();
            a2.h(this.e);
            a2.e = o.z();
            a2.d = o2.z();
            a2.j = dcdc.e();
            a2.g = dcdc.f(poll);
            return a2.b();
        }
        if (this.f.size() <= 0) {
            z = false;
        }
        dbsk.m(z, "No fields were found to process.");
        cyvi poll2 = this.f.poll();
        dcbg o3 = dcbg.b(this.e.k).o(new cyud(poll2.b()));
        dcbg o4 = dcbg.b(this.e.d()).o(new cyud(poll2.b()));
        dcdc<ContactMethodField> d = this.c.d();
        int size = d.size();
        while (true) {
            if (i >= size) {
                break;
            }
            int i2 = i + 1;
            if (d.get(i).k().equals(poll2.k())) {
                cyue cyueVar = a;
                o3 = o3.o(cyueVar);
                o4 = o4.o(cyueVar);
                break;
            }
            i = i2;
        }
        cyvt a3 = cyvt.a();
        a3.h(this.e);
        a3.j = dcdc.f(poll2);
        a3.e = o3.z();
        a3.d = o4.z();
        if (this.b) {
            a3.g = dcdc.e();
        }
        return a3.b();
    }
}
