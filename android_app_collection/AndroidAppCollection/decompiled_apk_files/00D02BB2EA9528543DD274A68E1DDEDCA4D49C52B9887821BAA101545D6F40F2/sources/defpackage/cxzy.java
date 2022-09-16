package defpackage;

import com.google.android.libraries.social.populous.AutoValue_IdentityInfo;
import com.google.android.libraries.social.populous.Person;
import com.google.android.libraries.social.populous.PersonMetadata;
import com.google.android.libraries.social.populous.core.ClientConfigInternal;
import com.google.android.libraries.social.populous.core.ContactMethodField;
import com.google.android.libraries.social.populous.core.Email;
import com.google.android.libraries.social.populous.core.InAppNotificationTarget;
import com.google.android.libraries.social.populous.core.Name;
import com.google.android.libraries.social.populous.core.PersonFieldMetadata;
import com.google.android.libraries.social.populous.core.Phone;
import com.google.android.libraries.social.populous.core.Photo;
import com.google.android.libraries.social.populous.core.SourceIdentity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: cxzy  reason: default package */
/* loaded from: classes5.dex */
public final class cxzy {
    private final ClientConfigInternal a;
    private final String b;
    private final long c;

    private cxzy(ClientConfigInternal clientConfigInternal, String str, long j) {
        this.a = clientConfigInternal;
        this.b = str;
        this.c = j;
    }

    public static cxzy c(ClientConfigInternal clientConfigInternal, String str, long j) {
        return new cxzy(clientConfigInternal, str, j);
    }

    public final Person a(cyvs cyvsVar) {
        return b(cyvsVar, null);
    }

    public final Person b(cyvs cyvsVar, @dzsi dccx<ContactMethodField> dccxVar) {
        AutoValue_IdentityInfo autoValue_IdentityInfo;
        ContactMethodField i;
        dbsk.s(cyvsVar.a());
        String str = !cyvsVar.m.isEmpty() ? cyvsVar.m.get(0) : null;
        cyep cyepVar = cyep.EMAIL;
        cyxk cyxkVar = cyxk.UNSPECIFIED;
        int ordinal = cyvsVar.f.ordinal();
        int i2 = ordinal != 1 ? ordinal != 3 ? 1 : 3 : 2;
        if (!cyvsVar.b().isEmpty()) {
            cxxh cxxhVar = new cxxh();
            dcdc<SourceIdentity> b = cyvsVar.b();
            if (b == null) {
                throw new NullPointerException("Null sourceIdsList");
            }
            cxxhVar.a = b;
            String str2 = cxxhVar.a == null ? " sourceIdsList" : "";
            if (!str2.isEmpty()) {
                throw new IllegalStateException(str2.length() != 0 ? "Missing required properties:".concat(str2) : new String("Missing required properties:"));
            }
            autoValue_IdentityInfo = new AutoValue_IdentityInfo(cxxhVar.a);
        } else {
            autoValue_IdentityInfo = null;
        }
        dcdc<Name> A = dcbg.b(cyvsVar.d()).s(cxys.a).A(dcmw.a.g(cxyr.a).h(this.a.E.c));
        dcdc<Photo> A2 = dcbg.b(cyvsVar.k).A(this.a.E.c);
        dccx F = dcdc.F();
        dccx F2 = dcdc.F();
        dccx F3 = dcdc.F();
        ArrayList arrayList = new ArrayList(cyvsVar.a().size() + cyvsVar.g().size());
        arrayList.addAll(cyvsVar.g());
        arrayList.addAll(cyvsVar.a());
        Collections.sort(arrayList, dyaq.e() ? cyxz.b : cyxz.a);
        HashSet c = dcnm.c();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            cyft cyftVar = (cyft) it.next();
            if (!(cyftVar instanceof InAppNotificationTarget) && (cyftVar instanceof cyvi)) {
                String k = ((cyvi) cyftVar).k();
                if (c.contains(k)) {
                    it.remove();
                }
                c.add(k);
            }
        }
        Iterator it2 = arrayList.iterator();
        int i3 = 0;
        while (it2.hasNext()) {
            cyft cyftVar2 = (cyft) it2.next();
            cygd l = PersonFieldMetadata.l();
            l.k(cyftVar2.b());
            Iterator it3 = it2;
            cybr cybrVar = (cybr) l;
            cybrVar.b = this.b;
            dcdc<Name> dcdcVar = A;
            cybrVar.c = Long.valueOf(this.c);
            PersonFieldMetadata i4 = l.i();
            if (cyftVar2 instanceof cyvi) {
                cyvi cyviVar = (cyvi) cyftVar2;
                if (cyviVar.a() == cyfj.EMAIL) {
                    cyey e = Email.e();
                    e.f(cyviVar.d());
                    e.e(i4);
                    ((cybx) e).a = cyviVar.e();
                    e.c(cyviVar.f());
                    i = e.i();
                } else {
                    if (cyviVar.a() == cyfj.PHONE_NUMBER) {
                        cygh e2 = Phone.e();
                        e2.e(cyviVar.d());
                        ((cycc) e2).a = cyviVar.c();
                        e2.c(i4);
                        i = e2.i();
                    }
                    i = null;
                }
            } else {
                if (cyftVar2 instanceof InAppNotificationTarget) {
                    cyfi m = ((InAppNotificationTarget) cyftVar2).m();
                    m.e(i4);
                    i = m.i();
                }
                i = null;
            }
            if (i != null) {
                PersonFieldMetadata b2 = i.b();
                b2.j = cyvsVar.c();
                int i5 = i3 + 1;
                b2.k = i3;
                if (dccxVar != null && !i.b().n.isEmpty()) {
                    dccxVar.g(i);
                }
                int ordinal2 = i.SA().ordinal();
                if (ordinal2 == 0) {
                    F2.g(i.h());
                } else if (ordinal2 == 1) {
                    F3.g(i.i());
                } else if (ordinal2 == 2 || ordinal2 == 3 || ordinal2 == 4 || ordinal2 == 5) {
                    F.g(i.j());
                }
                i3 = i5;
            }
            it2 = it3;
            A = dcdcVar;
        }
        cxzx r = Person.r();
        cxzz d = PersonMetadata.d();
        cxxj cxxjVar = (cxxj) d;
        cxxjVar.a = str;
        cxxjVar.b = autoValue_IdentityInfo;
        cxxjVar.c = i2;
        r.d(d.a());
        r.e(A);
        r.b(F2.f());
        r.f(F3.f());
        r.g(A2);
        r.c(F.f());
        cxxi cxxiVar = (cxxi) r;
        cxxiVar.b = cyvsVar.v;
        cxxiVar.a = cyvsVar.z;
        r.h(cygp.COALESCED == (dbsj.d(this.b) ? this.a.B : this.a.C));
        return r.a();
    }
}
