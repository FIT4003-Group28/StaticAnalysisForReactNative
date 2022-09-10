package defpackage;

import com.google.android.libraries.social.populous.core.AffinityMetadata;
import com.google.android.libraries.social.populous.core.C$AutoValue_PeopleApiAffinity;
import com.google.android.libraries.social.populous.core.ClientConfigInternal;
import com.google.android.libraries.social.populous.core.ContactMethodField;
import com.google.android.libraries.social.populous.core.DynamiteExtendedData;
import com.google.android.libraries.social.populous.core.Email;
import com.google.android.libraries.social.populous.core.GroupOrigin;
import com.google.android.libraries.social.populous.core.InAppNotificationTarget;
import com.google.android.libraries.social.populous.core.Name;
import com.google.android.libraries.social.populous.core.PeopleApiAffinity;
import com.google.android.libraries.social.populous.core.PersonExtendedData;
import com.google.android.libraries.social.populous.core.PersonFieldMetadata;
import com.google.android.libraries.social.populous.core.Phone;
import com.google.android.libraries.social.populous.core.Photo;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: cymy  reason: default package */
/* loaded from: classes5.dex */
public final class cymy {
    @dzsi
    public static cywi a(cymg cymgVar, final ClientConfigInternal clientConfigInternal, final int i, final cyuj cyujVar) {
        dcdc<Photo> f;
        int i2 = cymgVar.a;
        if (i2 == 2) {
            return b((cylo) cymgVar.b, clientConfigInternal, i, cyujVar);
        }
        PersonExtendedData personExtendedData = null;
        if (i2 != 3) {
            if (i2 != 4) {
                return null;
            }
            cyme cymeVar = (cyme) cymgVar.b;
            cywf s = cywi.s();
            s.b(dcdc.e());
            cyus cyusVar = (cyus) s;
            cyusVar.d = dcbg.b(cymeVar.b).s(new dbrn(clientConfigInternal, i, cyujVar) { // from class: cymo
                private final ClientConfigInternal a;
                private final cyuj b;
                private final int c;

                {
                    this.a = clientConfigInternal;
                    this.c = i;
                    this.b = cyujVar;
                }

                @Override // defpackage.dbrn
                public final Object a(Object obj) {
                    return cymy.a((cymg) obj, this.a, this.c, this.b);
                }
            }).z();
            s.c(decl.b(cymeVar.e));
            cyusVar.b = dcbg.b(cymeVar.c).s(new dbrn(clientConfigInternal, i) { // from class: cymp
                private final ClientConfigInternal a;
                private final int b;

                {
                    this.a = clientConfigInternal;
                    this.b = i;
                }

                @Override // defpackage.dbrn
                public final Object a(Object obj) {
                    ClientConfigInternal clientConfigInternal2 = this.a;
                    int i3 = this.b;
                    cymd cymdVar = (cymd) obj;
                    cyfh d = GroupOrigin.d();
                    cybz cybzVar = (cybz) d;
                    cybzVar.a = cymdVar.c;
                    cyle cyleVar = cymdVar.a;
                    if (cyleVar == null) {
                        cyleVar = cyle.e;
                    }
                    cyfw f2 = Name.f();
                    f2.b(cyleVar.a);
                    cycb cycbVar = (cycb) f2;
                    cycbVar.a = cyleVar.c;
                    cycbVar.b = cyleVar.d;
                    cyjt cyjtVar = cyleVar.b;
                    if (cyjtVar == null) {
                        cyjtVar = cyjt.g;
                    }
                    f2.d(cymy.c(cyjtVar, clientConfigInternal2, i3, false));
                    f2.c("");
                    cybzVar.b = f2.a();
                    cyls cylsVar = cymdVar.b;
                    if (cylsVar == null) {
                        cylsVar = cyls.d;
                    }
                    cybzVar.c = cymy.d(cylsVar, clientConfigInternal2, i3);
                    return d.a();
                }
            }).z();
            cyusVar.e = i;
            s.h(dcdc.e());
            cyil cyilVar = cymeVar.d;
            if (cyilVar == null) {
                cyilVar = cyil.f;
            }
            s.g(g(cyilVar));
            s.j(cyxk.GROUP);
            cyusVar.c = cymeVar.a;
            return s.a();
        }
        cyke cykeVar = (cyke) cymgVar.b;
        cywf s2 = cywi.s();
        s2.j(cyxk.GOOGLE_GROUP);
        String str = cykeVar.a;
        cyus cyusVar2 = (cyus) s2;
        cyusVar2.c = str;
        s2.i(dcdc.f(str));
        cyusVar2.e = i;
        s2.b(h(cykeVar.b));
        s2.d(i(cykeVar.c, clientConfigInternal, i, !cykeVar.d.isEmpty()));
        if (cykeVar.d.isEmpty()) {
            f = dcdc.e();
        } else {
            String str2 = cykeVar.d;
            cygi f2 = Photo.f();
            f2.e(str2);
            f2.b(false);
            f2.d(1);
            cygd l = PersonFieldMetadata.l();
            l.f = PeopleApiAffinity.e;
            l.g = ((C$AutoValue_PeopleApiAffinity) PeopleApiAffinity.e).a;
            l.b(duej.UNKNOWN_CONTAINER);
            l.e(false);
            l.f(false);
            l.j = cyvr.a(i);
            f2.c(l.i());
            f = dcdc.f(f2.a());
        }
        s2.h(f);
        cykd cykdVar = cykeVar.e;
        if (cykdVar == null) {
            cykdVar = cykd.b;
        }
        if (!cykdVar.equals(cykd.b)) {
            cyjh cyjhVar = cykdVar.a;
            if (cyjhVar == null) {
                cyjhVar = cyjh.g;
            }
            personExtendedData = PersonExtendedData.c(false, f(cyjhVar));
        }
        cyusVar2.a = personExtendedData;
        s2.g(PeopleApiAffinity.e);
        return s2.a();
    }

    public static cywi b(cylo cyloVar, final ClientConfigInternal clientConfigInternal, final int i, cyuj cyujVar) {
        final cykg cykgVar;
        dcdc<InAppNotificationTarget> z;
        PersonExtendedData c;
        final cymx cymxVar = new cymx(cyujVar);
        dcdc<cyvy> i2 = i(cyloVar.d, clientConfigInternal, i, cyloVar.c.size() > 0);
        dsrj<cylq> dsrjVar = cyloVar.e;
        final boolean z2 = cyloVar.c.size() > 0;
        dcdc<cyvy> z3 = dcbg.b(dsrjVar).s(new dbrn(clientConfigInternal, cymxVar, i, z2) { // from class: cymn
            private final ClientConfigInternal a;
            private final cymx b;
            private final boolean c;
            private final int d;

            {
                this.a = clientConfigInternal;
                this.b = cymxVar;
                this.d = i;
                this.c = z2;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                ClientConfigInternal clientConfigInternal2 = this.a;
                cymx cymxVar2 = this.b;
                int i3 = this.d;
                boolean z4 = this.c;
                cylq cylqVar = (cylq) obj;
                cyvx i4 = cyvy.i();
                i4.f(cyfj.PHONE_NUMBER);
                String str = cylqVar.a;
                if (clientConfigInternal2.b()) {
                    String str2 = cymxVar2.a.get(str);
                    if (str2 == null) {
                        str2 = cymxVar2.c.a(str);
                        cymxVar2.a.put(str, str2);
                    }
                    str = str2;
                }
                i4.j(str);
                String str3 = cylqVar.b;
                if (dbsj.d(str3)) {
                    str3 = cymxVar2.a(cylqVar.a);
                } else if (!cymxVar2.b.containsKey(cylqVar.a)) {
                    cymxVar2.b.put(cylqVar.a, cylqVar.b);
                }
                i4.d(str3);
                cyjt cyjtVar = cylqVar.c;
                if (cyjtVar == null) {
                    cyjtVar = cyjt.g;
                }
                i4.h(cymy.c(cyjtVar, clientConfigInternal2, i3, z4));
                return i4.k();
            }
        }).z();
        final double doubleValue = (!i2.isEmpty() || !z3.isEmpty()) ? ((Double) dcln.a.m(dcbg.b(i2).m(z3).s(cymh.a))).doubleValue() : dcyn.a;
        duey dueyVar = clientConfigInternal.j;
        dued duedVar = dued.AFFINITY_TYPE_UNKNOWN;
        int ordinal = dueyVar.ordinal();
        if (ordinal == 2) {
            cykgVar = cykg.YOUTUBE;
        } else if (ordinal == 5) {
            cykgVar = cykg.PHOTOS;
        } else if (ordinal == 7) {
            cykgVar = cykg.KABOO;
        } else if (ordinal == 10) {
            cykgVar = cykg.MAPS;
        } else if (ordinal == 15) {
            cykgVar = cykg.NEWS_360;
        } else {
            cykgVar = cykg.UNKNOWN;
        }
        cywf s = cywi.s();
        s.j(cyxk.PERSON);
        cyus cyusVar = (cyus) s;
        cyusVar.c = cyloVar.a;
        cyusVar.e = i;
        s.b(h(cyloVar.b));
        s.d(i2);
        s.f(z3);
        if (cykgVar == cykg.UNKNOWN) {
            z = dcdc.e();
        } else {
            dsrj<cykl> dsrjVar2 = cyloVar.f;
            final boolean z4 = cyloVar.c.size() > 0;
            z = dcbg.b(dsrjVar2).o(new dbsl(clientConfigInternal, cykgVar) { // from class: cymj
                private final ClientConfigInternal a;
                private final cykg b;

                {
                    this.a = clientConfigInternal;
                    this.b = cykgVar;
                }

                @Override // defpackage.dbsl
                public final boolean a(Object obj) {
                    ClientConfigInternal clientConfigInternal2 = this.a;
                    cykg cykgVar2 = this.b;
                    cykl cyklVar = (cykl) obj;
                    if (clientConfigInternal2.k) {
                        return new dsrh(cyklVar.a, cykl.b).contains(cykgVar2);
                    }
                    return true;
                }
            }).s(new dbrn(clientConfigInternal, cymxVar, i, z4, doubleValue) { // from class: cymk
                private final ClientConfigInternal a;
                private final cymx b;
                private final boolean c;
                private final double d;
                private final int e;

                {
                    this.a = clientConfigInternal;
                    this.b = cymxVar;
                    this.e = i;
                    this.c = z4;
                    this.d = doubleValue;
                }

                @Override // defpackage.dbrn
                public final Object a(Object obj) {
                    String str;
                    int b;
                    Iterator<cykj> it;
                    cyil cyilVar;
                    final ClientConfigInternal clientConfigInternal2 = this.a;
                    final cymx cymxVar2 = this.b;
                    final int i3 = this.e;
                    final boolean z5 = this.c;
                    double d = this.d;
                    cykl cyklVar = (cykl) obj;
                    cyfi n = InAppNotificationTarget.n();
                    int i4 = 3;
                    if (dyaq.f()) {
                        Iterator<cykj> it2 = cyklVar.e.iterator();
                        cykj cykjVar = null;
                        cyil cyilVar2 = null;
                        while (it2.hasNext()) {
                            cykj next = it2.next();
                            int b2 = cykk.b(next.a);
                            if ((b2 != 0 && b2 == 5) || ((b = cykk.b(next.a)) != 0 && b == i4)) {
                                cyjt cyjtVar = next.c;
                                if (cyjtVar == null) {
                                    cyjtVar = cyjt.g;
                                }
                                cyil e = cymy.e(cyjtVar.f, cyjp.b(clientConfigInternal2.h));
                                if (cykjVar != null) {
                                    cykj cykjVar2 = cykjVar;
                                    it = it2;
                                    cyilVar = e;
                                    if (Double.compare(e.b, cyilVar2.b) <= 0) {
                                        cykjVar = cykjVar2;
                                        it2 = it;
                                        i4 = 3;
                                    }
                                } else {
                                    it = it2;
                                    cyilVar = e;
                                }
                                cykjVar = next;
                                cyilVar2 = cyilVar;
                                it2 = it;
                                i4 = 3;
                            }
                        }
                        cykj cykjVar3 = cykjVar;
                        if (cykjVar3 == null) {
                            n.g(cyep.IN_APP_GAIA);
                            n.h(cyklVar.d);
                            int b3 = cykk.b(cyklVar.c);
                            if (b3 == 0 || b3 != 3) {
                                str = cyklVar.d;
                                ((cyca) n).a = str;
                            }
                        } else {
                            int b4 = cykk.b(cykjVar3.a);
                            if (b4 != 0 && b4 == 5) {
                                n.g(cyep.IN_APP_EMAIL);
                                n.h(cykjVar3.b);
                                int b5 = cykk.b(cyklVar.c);
                                if (b5 == 0 || b5 != 3) {
                                    str = cyklVar.d;
                                    ((cyca) n).a = str;
                                }
                            } else {
                                n.g(cyep.IN_APP_PHONE);
                                n.h(cymxVar2.a(cykjVar3.b));
                                int b6 = cykk.b(cyklVar.c);
                                if (b6 == 0 || b6 != 3) {
                                    str = cyklVar.d;
                                    ((cyca) n).a = str;
                                }
                            }
                        }
                    } else {
                        int b7 = cykk.b(cyklVar.c);
                        if (b7 == 0) {
                            b7 = 1;
                        }
                        dued duedVar2 = dued.AFFINITY_TYPE_UNKNOWN;
                        duey dueyVar2 = duey.UNKNOWN;
                        int i5 = b7 - 2;
                        ((cyca) n).b = i5 != 1 ? i5 != 2 ? i5 != 3 ? 1 : 4 : 3 : 2;
                        int b8 = cykk.b(cyklVar.c);
                        n.h((b8 != 0 && b8 == 3) ? cymxVar2.a(cyklVar.d) : cyklVar.d);
                        Iterable o = dcft.o(dcft.i(cyklVar.e, cyml.a), new dbrn(cymxVar2, clientConfigInternal2, i3, z5) { // from class: cymm
                            private final cymx a;
                            private final ClientConfigInternal b;
                            private final boolean c;
                            private final int d;

                            {
                                this.a = cymxVar2;
                                this.b = clientConfigInternal2;
                                this.d = i3;
                                this.c = z5;
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // defpackage.dbrn
                            public final Object a(Object obj2) {
                                cyey cyeyVar;
                                cymx cymxVar3 = this.a;
                                ClientConfigInternal clientConfigInternal3 = this.b;
                                int i6 = this.d;
                                boolean z6 = this.c;
                                cykj cykjVar4 = (cykj) obj2;
                                int b9 = cykk.b(cykjVar4.a);
                                if (b9 == 0 || b9 != 3) {
                                    cyey e2 = Email.e();
                                    e2.f(cykjVar4.b);
                                    cyeyVar = e2;
                                } else {
                                    cygh e3 = Phone.e();
                                    e3.e(cymxVar3.a(cykjVar4.b));
                                    cyeyVar = e3;
                                }
                                cyjt cyjtVar2 = cykjVar4.c;
                                if (cyjtVar2 == null) {
                                    cyjtVar2 = cyjt.g;
                                }
                                cyeyVar.d(cymy.c(cyjtVar2, clientConfigInternal3, i6, z6));
                                return cyeyVar.i();
                            }
                        });
                        n.f(dyaw.a.a().f() ? dcdc.w(ContactMethodField.g, o) : dcdc.q(o));
                    }
                    cyjt cyjtVar2 = cyklVar.f;
                    if (cyjtVar2 == null) {
                        cyjtVar2 = cyjt.g;
                    }
                    PersonFieldMetadata c2 = cymy.c(cyjtVar2, clientConfigInternal2, i3, z5);
                    if (Double.compare(c2.h.a(), dcyn.a) == 0 && d > dcyn.a) {
                        PeopleApiAffinity g = PeopleApiAffinity.g(d + 0.001d, c2.h.b());
                        cygd l = PersonFieldMetadata.l();
                        l.k(c2);
                        l.f = g;
                        l.g = g.a();
                        c2 = l.i();
                    }
                    cygd l2 = PersonFieldMetadata.l();
                    l2.k(c2);
                    l2.f(true);
                    n.e(l2.i());
                    return n.i();
                }
            }).z();
        }
        s.e(z);
        s.h(dcbg.b(cyloVar.c).s(new dbrn(clientConfigInternal, i) { // from class: cymu
            private final ClientConfigInternal a;
            private final int b;

            {
                this.a = clientConfigInternal;
                this.b = i;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                return cymy.d((cyls) obj, this.a, this.b);
            }
        }).z());
        s.i(dcdc.r(cyloVar.g));
        s.k(dcbg.b(cyloVar.h).s(cymv.a).z());
        s.g(g(e(cyloVar.i, cyjp.b(clientConfigInternal.h))));
        cyln cylnVar = cyloVar.j;
        if (cylnVar == null) {
            cylnVar = cyln.c;
        }
        if (cylnVar.equals(cyln.c)) {
            c = null;
        } else {
            boolean z5 = cylnVar.a;
            cyjh cyjhVar = cylnVar.b;
            if (cyjhVar == null) {
                cyjhVar = cyjh.g;
            }
            c = PersonExtendedData.c(z5, f(cyjhVar));
        }
        cyusVar.a = c;
        return s.a();
    }

    public static PersonFieldMetadata c(cyjt cyjtVar, ClientConfigInternal clientConfigInternal, int i, boolean z) {
        cyil e = e(cyjtVar.f, cyjp.b(clientConfigInternal.h));
        cygd l = PersonFieldMetadata.l();
        l.j = cyvr.a(i);
        int b = cyiu.b(cyjtVar.a);
        if (b == 0) {
            b = 1;
        }
        l.b(cyjp.a(b));
        ((cybr) l).a = cyjtVar.b;
        l.i = dcbg.b(cyjtVar.e).s(cyms.a).z();
        l.e(cyjtVar.c);
        l.f(cyjtVar.d);
        l.f = g(e);
        l.g = e.b;
        l.l = z;
        return l.i();
    }

    public static Photo d(cyls cylsVar, ClientConfigInternal clientConfigInternal, int i) {
        cygi f = Photo.f();
        f.d(1);
        f.e(cylsVar.a);
        f.b(cylsVar.b);
        cyjt cyjtVar = cylsVar.c;
        if (cyjtVar == null) {
            cyjtVar = cyjt.g;
        }
        f.c(c(cyjtVar, clientConfigInternal, i, true));
        return f.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static cyil e(List<cyil> list, final int i) {
        dbsg r = dcbg.b(list).r(new dbsl(i) { // from class: cymq
            private final int a;

            {
                this.a = i;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                int i2 = this.a;
                int b = cyik.b(((cyil) obj).a);
                if (b == 0) {
                    b = 1;
                }
                return b == i2;
            }
        });
        if (!r.a()) {
            r = dcbg.b(list).r(cymr.a);
        }
        return (cyil) r.c(cyil.f);
    }

    @dzsi
    private static DynamiteExtendedData f(cyjh cyjhVar) {
        DynamiteExtendedData.OrganizationInfo organizationInfo = null;
        String str = null;
        organizationInfo = null;
        if (!cyjhVar.equals(cyjh.g)) {
            int i = cyjhVar.e;
            int i2 = 0;
            int i3 = i != 0 ? i != 1 ? i != 2 ? 0 : 4 : 3 : 2;
            if (i3 == 0) {
                i3 = 1;
            }
            dued duedVar = dued.AFFINITY_TYPE_UNKNOWN;
            duey dueyVar = duey.UNKNOWN;
            int i4 = i3 - 2;
            int i5 = i4 != 1 ? i4 != 2 ? 1 : 3 : 2;
            int i6 = cyjhVar.d;
            int i7 = i6 != 0 ? i6 != 1 ? i6 != 2 ? 0 : 4 : 3 : 2;
            if (i7 == 0) {
                i7 = 1;
            }
            int i8 = i7 - 2;
            int i9 = i8 != 1 ? i8 != 2 ? 1 : 3 : 2;
            int i10 = cyjhVar.a;
            int i11 = 5;
            if (i10 == 0) {
                i2 = 2;
            } else if (i10 == 1) {
                i2 = 3;
            } else if (i10 == 2) {
                i2 = 4;
            } else if (i10 == 3) {
                i2 = 5;
            } else if (i10 == 4) {
                i2 = 6;
            }
            if (i2 == 0) {
                i2 = 1;
            }
            int i12 = i2 - 2;
            if (i12 == 1) {
                i11 = 2;
            } else if (i12 == 2) {
                i11 = 3;
            } else if (i12 == 3) {
                i11 = 4;
            } else if (i12 != 4) {
                i11 = 1;
            }
            Long valueOf = Long.valueOf(cyjhVar.b);
            String str2 = cyjhVar.c;
            cyjf cyjfVar = cyjhVar.f;
            if (cyjfVar == null) {
                cyjfVar = cyjf.c;
            }
            if (!cyjfVar.equals(cyjf.c)) {
                int i13 = cyjfVar.a;
                if (i13 == 1) {
                    organizationInfo = DynamiteExtendedData.OrganizationInfo.b(DynamiteExtendedData.OrganizationInfo.ConsumerInfo.a());
                } else if (i13 == 2) {
                    cyje cyjeVar = (cyje) cyjfVar.b;
                    if (cyjeVar.a != null) {
                        cyjd cyjdVar = cyjeVar.a;
                        if (cyjdVar == null) {
                            cyjdVar = cyjd.b;
                        }
                        str = cyjdVar.a;
                    }
                    organizationInfo = DynamiteExtendedData.OrganizationInfo.a(DynamiteExtendedData.OrganizationInfo.CustomerInfo.a(DynamiteExtendedData.OrganizationInfo.CustomerInfo.CustomerId.a(str)));
                }
            }
            return DynamiteExtendedData.i(i5, i9, i11, valueOf, str2, null, null, organizationInfo);
        }
        return null;
    }

    private static PeopleApiAffinity g(cyil cyilVar) {
        double d = cyilVar.b;
        String str = cyilVar.c;
        cycj f = AffinityMetadata.f();
        cyij cyijVar = cyilVar.e;
        if (cyijVar == null) {
            cyijVar = cyij.f;
        }
        f.b(cyijVar.d);
        cyij cyijVar2 = cyilVar.e;
        if (cyijVar2 == null) {
            cyijVar2 = cyij.f;
        }
        f.c(cyijVar2.e);
        cyij cyijVar3 = cyilVar.e;
        if (cyijVar3 == null) {
            cyijVar3 = cyij.f;
        }
        f.d(cyijVar3.b);
        cyij cyijVar4 = cyilVar.e;
        if (cyijVar4 == null) {
            cyijVar4 = cyij.f;
        }
        f.e(cyijVar4.c);
        cyij cyijVar5 = cyilVar.e;
        if (cyijVar5 == null) {
            cyijVar5 = cyij.f;
        }
        f.f(cyijVar5.a);
        return PeopleApiAffinity.e(d, str, f.a(), cyilVar.d);
    }

    private static dcdc<cywh> h(List<cyle> list) {
        return dcbg.b(list).s(cymt.a).z();
    }

    private static dcdc<cyvy> i(List<cyjo> list, final ClientConfigInternal clientConfigInternal, final int i, final boolean z) {
        return dcbg.b(list).s(new dbrn(clientConfigInternal, i, z) { // from class: cymw
            private final ClientConfigInternal a;
            private final boolean b;
            private final int c;

            {
                this.a = clientConfigInternal;
                this.c = i;
                this.b = z;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                ClientConfigInternal clientConfigInternal2 = this.a;
                int i2 = this.c;
                boolean z2 = this.b;
                cyjo cyjoVar = (cyjo) obj;
                if (dcpf.a.matcher(cyjoVar.a).matches()) {
                    cyvx i3 = cyvy.i();
                    i3.f(cyfj.EMAIL);
                    i3.j(cyjoVar.a);
                    i3.d(cyjoVar.b);
                    cyjt cyjtVar = cyjoVar.d;
                    if (cyjtVar == null) {
                        cyjtVar = cyjt.g;
                    }
                    i3.h(cymy.c(cyjtVar, clientConfigInternal2, i2, z2));
                    i3.e(dcbg.b(cyjoVar.e).s(new dbrn(clientConfigInternal2, i2, z2) { // from class: cymi
                        private final ClientConfigInternal a;
                        private final boolean b;
                        private final int c;

                        {
                            this.a = clientConfigInternal2;
                            this.c = i2;
                            this.b = z2;
                        }

                        @Override // defpackage.dbrn
                        public final Object a(Object obj2) {
                            ClientConfigInternal clientConfigInternal3 = this.a;
                            int i4 = this.c;
                            boolean z3 = this.b;
                            cyjn cyjnVar = (cyjn) obj2;
                            cyjt cyjtVar2 = cyjnVar.a;
                            if (cyjtVar2 == null) {
                                cyjtVar2 = cyjt.g;
                            }
                            PersonFieldMetadata c = cymy.c(cyjtVar2, clientConfigInternal3, i4, z3);
                            cyjm cyjmVar = cyjnVar.b;
                            if (cyjmVar == null) {
                                cyjmVar = cyjm.c;
                            }
                            double d = cyjmVar.a;
                            int i5 = cyjmVar.b;
                            int i6 = 5;
                            int i7 = i5 != 0 ? i5 != 1 ? i5 != 2 ? i5 != 3 ? i5 != 4 ? 0 : 6 : 5 : 4 : 3 : 2;
                            if (i7 == 0) {
                                i7 = 1;
                            }
                            dued duedVar = dued.AFFINITY_TYPE_UNKNOWN;
                            duey dueyVar = duey.UNKNOWN;
                            int i8 = i7 - 2;
                            if (i8 == 1) {
                                i6 = 2;
                            } else if (i8 == 2) {
                                i6 = 3;
                            } else if (i8 == 3) {
                                i6 = 4;
                            } else if (i8 != 4) {
                                i6 = 1;
                            }
                            return Email.Certificate.d(c, Email.Certificate.CertificateStatus.d(d, i6), cyjnVar.c);
                        }
                    }).z());
                    ((cyuo) i3).a = Email.ExtendedData.d(cyjoVar.c, Email.EmailSecurityData.b(cyjoVar.f), dsiu.INTERNAL_EXTERNAL_STATE_UNSPECIFIED);
                    return i3.k();
                }
                return cywi.a;
            }
        }).z();
    }
}
