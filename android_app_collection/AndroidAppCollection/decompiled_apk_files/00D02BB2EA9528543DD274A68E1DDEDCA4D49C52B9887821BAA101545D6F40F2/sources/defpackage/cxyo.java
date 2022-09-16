package defpackage;

import com.google.android.libraries.social.populous.Autocompletion;
import com.google.android.libraries.social.populous.Group;
import com.google.android.libraries.social.populous.GroupMember;
import com.google.android.libraries.social.populous.Person;
import com.google.android.libraries.social.populous.core.ClientConfigInternal;
import com.google.android.libraries.social.populous.core.ContactMethodField;
import com.google.android.libraries.social.populous.core.GroupMetadata;
import com.google.android.libraries.social.populous.core.GroupOrigin;
import com.google.android.libraries.social.populous.core.MatchInfo;
import com.google.android.libraries.social.populous.core.Name;
import com.google.android.libraries.social.populous.core.PeopleApiAffinity;
import com.google.android.libraries.social.populous.core.PersonFieldMetadata;
import com.google.android.libraries.social.populous.core.Photo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: cxyo  reason: default package */
/* loaded from: classes5.dex */
public final class cxyo {
    private final ClientConfigInternal a;
    private final cxzy b;
    private final cxzj c;
    private final String d;
    private final long e;

    private cxyo(ClientConfigInternal clientConfigInternal, String str, long j) {
        this.a = clientConfigInternal;
        this.d = str;
        this.e = j;
        this.b = cxzy.c(clientConfigInternal, str, j);
        this.c = new cxzj(clientConfigInternal, str, j);
    }

    public static cxyo c(ClientConfigInternal clientConfigInternal, String str, long j) {
        return new cxyo(clientConfigInternal, str, j);
    }

    public static dbsg<Set<MatchInfo>> e(cywm cywmVar, dsgt dsgtVar) {
        cyfx b;
        dbsg<cyfz> f = cywmVar.f(dsgtVar);
        return (!f.a() || (b = f.b().b()) == null) ? dbpy.a : dbsg.i(b.f());
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x0199, code lost:
        if (((r3.b == 2 ? (defpackage.dshb) r3.c : defpackage.dshb.f).a & 2) != 0) goto L89;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.google.android.libraries.social.populous.Autocompletion f(final defpackage.cywm r28) {
        /*
            Method dump skipped, instructions count: 1557
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cxyo.f(cywm):com.google.android.libraries.social.populous.Autocompletion");
    }

    private final List<dsgt> g(cywm cywmVar) {
        return new ArrayList(cywmVar.d(this.a.l));
    }

    private static boolean h(dsgt dsgtVar, cywm cywmVar) {
        cyfx b;
        dbsg<cyfz> f = cywmVar.f(dsgtVar);
        return dyaq.d() && f.a() && (b = f.b().b()) != null && b.b();
    }

    private final Name i(dshv dshvVar, dbsg<Set<MatchInfo>> dbsgVar) {
        cygd l = PersonFieldMetadata.l();
        cybr cybrVar = (cybr) l;
        cybrVar.b = this.d;
        cybrVar.c = Long.valueOf(this.e);
        if (dbsgVar.a()) {
            l.h = dcdc.r(dbsgVar.b());
        }
        cyfw f = Name.f();
        f.b(dshvVar.b);
        f.c("");
        f.d(l.i());
        int i = dshvVar.a;
        if ((i & 2) != 0) {
            ((cycb) f).a = dshvVar.c;
        }
        if ((i & 4) != 0) {
            ((cycb) f).b = dshvVar.d;
        }
        return f.a();
    }

    private static Photo j(dsig dsigVar) {
        cygi f = Photo.f();
        f.e(dsigVar.b);
        boolean z = true;
        f.d(1);
        int a = dsif.a(dsigVar.c);
        if (a != 0 && a == 4) {
            z = false;
        }
        f.b(z);
        return f.a();
    }

    public final Autocompletion a(cyvs cyvsVar) {
        cyxk cyxkVar = cyxk.UNSPECIFIED;
        int ordinal = cyvsVar.f.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                cxyf f = Autocompletion.f();
                cxzj cxzjVar = this.c;
                dccx F = dcdc.F();
                dcdc<cyvs> dcdcVar = cyvsVar.y;
                int size = dcdcVar.size();
                for (int i = 0; i < size; i++) {
                    cxzl cxzlVar = cxzjVar.a;
                    cxzk c = GroupMember.c();
                    c.c();
                    ((cxxg) c).a = cxzlVar.a.a(dcdcVar.get(i));
                    F.g(c.d());
                }
                dcdc<GroupMember> f2 = F.f();
                boolean isEmpty = f2.isEmpty();
                cxzi g = Group.g();
                g.c(cyvsVar.h());
                g.b(dbsj.e(cyvsVar.z));
                cyfg g2 = GroupMetadata.g();
                g2.g(cyvsVar.w);
                g2.b(true ^ isEmpty);
                g2.c(cyvsVar.g);
                g2.e(cxzjVar.b);
                g2.f(cxzjVar.c);
                g2.d(cyvsVar.c());
                g.e(g2.a());
                g.d(f2);
                g.f(cyvsVar.x);
                ((cxxe) f).b = g.a();
                f.d(dcdc.e());
                return f.f();
            } else if (ordinal != 3) {
                String valueOf = String.valueOf(cyvsVar.f);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
                sb.append("Unknown result type: ");
                sb.append(valueOf);
                throw new IllegalStateException(sb.toString());
            }
        }
        dccx<ContactMethodField> F2 = dcdc.F();
        Person b = this.b.b(cyvsVar, F2);
        cxyf f3 = Autocompletion.f();
        ((cxxe) f3).a = b;
        f3.d(F2.f());
        return f3.f();
    }

    public final Autocompletion b(cywm cywmVar) {
        dshf dshfVar;
        cyxk cyxkVar = cyxk.UNSPECIFIED;
        int a = dsgj.a(cywmVar.a.a);
        int i = a - 1;
        if (a != 0) {
            if (i == 0) {
                return f(cywmVar);
            }
            if (i == 1) {
                dsgk dsgkVar = cywmVar.a;
                if (dsgkVar.a == 2) {
                    dshfVar = (dshf) dsgkVar.b;
                } else {
                    dshfVar = dshf.e;
                }
                dccx F = dcdc.F();
                for (dsia dsiaVar : dshfVar.b) {
                    dsgi bZ = dsgk.c.bZ();
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dsgk dsgkVar2 = (dsgk) bZ.b;
                    dsiaVar.getClass();
                    dsgkVar2.b = dsiaVar;
                    dsgkVar2.a = 1;
                    cywm cywmVar2 = new cywm(bZ.bK());
                    cywmVar2.b.putAll(cywmVar.b);
                    Autocompletion f = f(cywmVar2);
                    cxzk c = GroupMember.c();
                    c.c();
                    ((cxxg) c).a = f.b();
                    F.g(c.d());
                }
                dbsg<cyfx> g = cywmVar.g(dshfVar);
                dcdc<GroupMember> f2 = F.f();
                cxyf f3 = Autocompletion.f();
                cxzi g2 = Group.g();
                g2.d(f2);
                g2.c(dshfVar.d);
                g2.b(dshfVar.d);
                dsgv dsgvVar = dshfVar.a;
                if (dsgvVar == null) {
                    dsgvVar = dsgv.f;
                }
                cyfh d = GroupOrigin.d();
                if ((2 & dsgvVar.a) != 0) {
                    dbsg<Set<MatchInfo>> h = g.h(cxym.a);
                    dshv dshvVar = dsgvVar.c;
                    if (dshvVar == null) {
                        dshvVar = dshv.e;
                    }
                    ((cybz) d).b = i(dshvVar, h);
                }
                if ((dsgvVar.a & 1) != 0) {
                    dsig dsigVar = dsgvVar.b;
                    if (dsigVar == null) {
                        dsigVar = dsig.d;
                    }
                    ((cybz) d).c = j(dsigVar);
                }
                g2.f(dcdc.f(d.a()));
                cyfg g3 = GroupMetadata.g();
                g3.g(dshfVar.c);
                g3.b(true ^ f2.isEmpty());
                g3.f(this.e);
                g3.e(this.d);
                dsgv dsgvVar2 = dshfVar.a;
                if (dsgvVar2 == null) {
                    dsgvVar2 = dsgv.f;
                }
                dsgd dsgdVar = dsgvVar2.d;
                if (dsgdVar == null) {
                    dsgdVar = dsgd.d;
                }
                g3.c(PeopleApiAffinity.g(dcyn.a, dsgdVar.b.J()));
                g3.d(cywmVar.c);
                g2.e(g3.a());
                ((cxxe) f3).b = g2.a();
                return f3.f();
            }
            throw new IllegalStateException("Unsupported data type.");
        }
        throw null;
    }

    public final PersonFieldMetadata d(dsgt dsgtVar, int i, int i2, dbsg<Set<MatchInfo>> dbsgVar, dbsg<cyfz> dbsgVar2) {
        cyfx b;
        cygd l = PersonFieldMetadata.l();
        l.d = i;
        l.e = i2;
        dsgv dsgvVar = dsgtVar.d;
        if (dsgvVar == null) {
            dsgvVar = dsgv.f;
        }
        dsig dsigVar = dsgvVar.b;
        if (dsigVar == null) {
            dsigVar = dsig.d;
        }
        int a = dsif.a(dsigVar.c);
        boolean z = false;
        if (a != 0 && a == 4) {
            z = true;
        }
        l.l = z;
        dsgv dsgvVar2 = dsgtVar.d;
        if (dsgvVar2 == null) {
            dsgvVar2 = dsgv.f;
        }
        l.e(dsgvVar2.e);
        cybr cybrVar = (cybr) l;
        cybrVar.b = this.d;
        cybrVar.c = Long.valueOf(this.e);
        dsgv dsgvVar3 = dsgtVar.d;
        if (dsgvVar3 == null) {
            dsgvVar3 = dsgv.f;
        }
        dsgd dsgdVar = dsgvVar3.d;
        if (dsgdVar == null) {
            dsgdVar = dsgd.d;
        }
        l.f = PeopleApiAffinity.g(dcyn.a, dsgdVar.b.J());
        if (dbsgVar2.a() && (b = dbsgVar2.b().b()) != null) {
            if (dyaq.c()) {
                l.m = b.a();
            }
            if (!b.c().isEmpty()) {
                l.j = EnumSet.copyOf((Collection) b.c());
            }
        }
        if (dbsgVar.a()) {
            l.h = dcdc.r(dbsgVar.b());
        }
        return l.i();
    }
}
