package com.google.android.libraries.social.peoplekit.common.dataservice.populous;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.libraries.social.peoplekit.common.analytics.PeopleKitVisualElementPath;
import com.google.android.libraries.social.peoplekit.common.analytics.Stopwatch;
import com.google.android.libraries.social.peoplekit.common.dataservice.Channel;
import com.google.android.libraries.social.peoplekit.common.dataservice.CoalescedChannels;
import com.google.android.libraries.social.peoplekit.common.dataservice.ManualChannel;
import com.google.android.libraries.social.peoplekit.common.dataservice.PeopleKitDataLayer;
import com.google.android.libraries.social.peoplekit.configs.PeopleKitConfig;
import com.google.android.libraries.social.populous.Autocompletion;
import com.google.android.libraries.social.populous.android.AndroidLibAutocompleteSession;
import com.google.android.libraries.social.populous.core.ContactMethodField;
import com.google.android.libraries.social.populous.core.Email;
import com.google.android.libraries.social.populous.core.Loggable;
import com.google.android.libraries.social.populous.core.PersonFieldMetadata;
import com.google.android.libraries.social.populous.core.Phone;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class PopulousDataLayer implements PeopleKitDataLayer, cxyp, cxrd {
    public static final Parcelable.Creator<PopulousDataLayer> CREATOR = new cxrw();
    final AndroidLibAutocompleteSession a;
    public final PeopleKitConfig b;
    cybo c;
    private final Set<cxri> d;
    private cxre e;
    private cxqo f;
    private final boolean g;
    private boolean h;
    private Autocompletion[] i;
    private boolean j;

    public PopulousDataLayer(Parcel parcel) {
        this.d = new HashSet();
        boolean z = false;
        this.j = false;
        AndroidLibAutocompleteSession androidLibAutocompleteSession = (AndroidLibAutocompleteSession) parcel.readParcelable(AndroidLibAutocompleteSession.class.getClassLoader());
        this.a = androidLibAutocompleteSession;
        androidLibAutocompleteSession.g(this);
        this.b = (PeopleKitConfig) parcel.readParcelable(PeopleKitConfig.class.getClassLoader());
        this.h = parcel.readInt() != 0;
        this.g = parcel.readInt() != 0 ? true : z;
        this.j = true;
    }

    static final Loggable v(Channel channel) {
        if (channel instanceof PopulousChannel) {
            return ((PopulousChannel) channel).B();
        }
        if (cxsg.g.f().booleanValue()) {
            cygd l = PersonFieldMetadata.l();
            l.j(cygl.USER_ENTERED);
            PersonFieldMetadata i = l.i();
            if (channel.d() == 1) {
                cyey e = Email.e();
                e.f(channel.c());
                e.e(i);
                return e.i();
            }
            cygh e2 = Phone.e();
            e2.e(channel.c());
            e2.c(i);
            return e2.i();
        } else if (channel.d() == 1) {
            cyey e3 = Email.e();
            e3.f(channel.c());
            return e3.i();
        } else {
            cygh e4 = Phone.e();
            e4.e(channel.c());
            return e4.i();
        }
    }

    private final void w() {
        if (!this.j) {
            return;
        }
        throw new IllegalStateException("The PopulousDataLayer was not rehydrated before being used");
    }

    private final void x(int i) {
        cxqo cxqoVar = this.f;
        eazd bZ = eaze.g.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        eaze eazeVar = (eaze) bZ.b;
        eazeVar.b = 4;
        eazeVar.a |= 1;
        eazh bZ2 = eazi.e.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        eazi eaziVar = (eazi) bZ2.b;
        eaziVar.b = 1;
        eaziVar.a |= 1;
        long a = this.f.a("top_suggestions_latency").a();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        eazi eaziVar2 = (eazi) bZ2.b;
        eaziVar2.a |= 2;
        eaziVar2.c = a;
        int i2 = this.f.i();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        eazi eaziVar3 = (eazi) bZ2.b;
        int i3 = i2 - 1;
        if (i2 != 0) {
            eaziVar3.d = i3;
            eaziVar3.a |= 4;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            eaze eazeVar2 = (eaze) bZ.b;
            eazi bK = bZ2.bK();
            bK.getClass();
            eazeVar2.e = bK;
            eazeVar2.a |= 8;
            eazk bZ3 = eazl.e.bZ();
            int g = this.f.g();
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            eazl eazlVar = (eazl) bZ3.b;
            int i4 = g - 1;
            if (g != 0) {
                eazlVar.b = i4;
                eazlVar.a |= 1;
                eazl eazlVar2 = (eazl) bZ3.b;
                eazlVar2.c = 1;
                int i5 = eazlVar2.a | 2;
                eazlVar2.a = i5;
                eazlVar2.a = 4 | i5;
                eazlVar2.d = i;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                eaze eazeVar3 = (eaze) bZ.b;
                eazl bK2 = bZ3.bK();
                bK2.getClass();
                eazeVar3.c = bK2;
                eazeVar3.a |= 2;
                cxqoVar.b(bZ.bK());
                return;
            }
            throw null;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00c6  */
    @Override // defpackage.cxyp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.google.android.libraries.social.populous.Autocompletion[] r19, defpackage.cxyh r20) {
        /*
            Method dump skipped, instructions count: 833
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.social.peoplekit.common.dataservice.populous.PopulousDataLayer.a(com.google.android.libraries.social.populous.Autocompletion[], cxyh):void");
    }

    @Override // defpackage.cxrd
    public final void b(List<CoalescedChannels> list, int i) {
        cxqo cxqoVar = this.f;
        eazd bZ = eaze.g.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        eaze eazeVar = (eaze) bZ.b;
        eazeVar.b = 4;
        eazeVar.a |= 1;
        eazh bZ2 = eazi.e.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        eazi eaziVar = (eazi) bZ2.b;
        eaziVar.b = 1;
        eaziVar.a |= 1;
        long a = this.f.a("device_latency").a();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        eazi eaziVar2 = (eazi) bZ2.b;
        eaziVar2.a |= 2;
        eaziVar2.c = a;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        eaze eazeVar2 = (eaze) bZ.b;
        eazi bK = bZ2.bK();
        bK.getClass();
        eazeVar2.e = bK;
        eazeVar2.a |= 8;
        eazk bZ3 = eazl.e.bZ();
        int g = this.f.g();
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        eazl eazlVar = (eazl) bZ3.b;
        int i2 = g - 1;
        if (g != 0) {
            eazlVar.b = i2;
            eazlVar.a |= 1;
            eazl eazlVar2 = (eazl) bZ3.b;
            eazlVar2.c = 3;
            int i3 = eazlVar2.a | 2;
            eazlVar2.a = i3;
            eazlVar2.a = 4 | i3;
            eazlVar2.d = 0;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            eaze eazeVar3 = (eaze) bZ.b;
            eazl bK2 = bZ3.bK();
            bK2.getClass();
            eazeVar3.c = bK2;
            eazeVar3.a |= 2;
            cxqoVar.b(bZ.bK());
            cxra a2 = cxrb.a();
            a2.a = 0;
            a2.b = true;
            a2.c = "";
            a2.d = i;
            cxrb a3 = a2.a();
            for (cxri cxriVar : this.d) {
                cxriVar.u(list, a3);
            }
            return;
        }
        throw null;
    }

    @Override // com.google.android.libraries.social.peoplekit.common.dataservice.PeopleKitDataLayer
    public final void c(cxri cxriVar) {
        this.d.add(cxriVar);
    }

    @Override // com.google.android.libraries.social.peoplekit.common.dataservice.PeopleKitDataLayer
    public final void d(cxri cxriVar) {
        this.d.remove(cxriVar);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.libraries.social.peoplekit.common.dataservice.PeopleKitDataLayer
    public final void e() {
        this.d.clear();
    }

    @Override // com.google.android.libraries.social.peoplekit.common.dataservice.PeopleKitDataLayer
    public final void f(Channel channel) {
        w();
        if (channel instanceof PopulousChannel) {
            this.a.j(v(channel));
        }
    }

    @Override // com.google.android.libraries.social.peoplekit.common.dataservice.PeopleKitDataLayer
    public final void g(Channel channel) {
        w();
        Loggable v = v(channel);
        AndroidLibAutocompleteSession androidLibAutocompleteSession = this.a;
        String f = channel.f();
        if (v instanceof ContactMethodField) {
            ContactMethodField contactMethodField = (ContactMethodField) v;
            if (androidLibAutocompleteSession.j.get(contactMethodField.k()) == null) {
                androidLibAutocompleteSession.j.put(contactMethodField.k(), f);
            }
        }
        this.a.l(v);
        Stopwatch a = this.f.a("TimeToFirstSelection");
        if (a.c) {
            a.d();
            int a2 = channel.a();
            int i = 3;
            if (a2 != 1) {
                if (a2 == 2) {
                    i = 2;
                } else if (a2 != 3) {
                    i = a2 != 4 ? 1 : 4;
                }
            }
            cxqo cxqoVar = this.f;
            eazd bZ = eaze.g.bZ();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            eaze eazeVar = (eaze) bZ.b;
            eazeVar.b = 4;
            eazeVar.a |= 1;
            eazh bZ2 = eazi.e.bZ();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            eazi eaziVar = (eazi) bZ2.b;
            eaziVar.b = 15;
            eaziVar.a |= 1;
            long a3 = a.a();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            eazi eaziVar2 = (eazi) bZ2.b;
            eaziVar2.a |= 2;
            eaziVar2.c = a3;
            int i2 = this.f.i();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            eazi eaziVar3 = (eazi) bZ2.b;
            int i3 = i2 - 1;
            if (i2 == 0) {
                throw null;
            }
            eaziVar3.d = i3;
            eaziVar3.a |= 4;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            eaze eazeVar2 = (eaze) bZ.b;
            eazi bK = bZ2.bK();
            bK.getClass();
            eazeVar2.e = bK;
            eazeVar2.a |= 8;
            eazk bZ3 = eazl.e.bZ();
            int g = this.f.g();
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            eazl eazlVar = (eazl) bZ3.b;
            int i4 = g - 1;
            if (g == 0) {
                throw null;
            }
            eazlVar.b = i4;
            int i5 = eazlVar.a | 1;
            eazlVar.a = i5;
            eazlVar.c = i - 1;
            eazlVar.a = i5 | 2;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            eaze eazeVar3 = (eaze) bZ.b;
            eazl bK2 = bZ3.bK();
            bK2.getClass();
            eazeVar3.c = bK2;
            eazeVar3.a |= 2;
            cxqoVar.b(bZ.bK());
        }
    }

    @Override // com.google.android.libraries.social.peoplekit.common.dataservice.PeopleKitDataLayer
    public final void h(Channel channel) {
        w();
        this.a.k(v(channel));
    }

    @Override // com.google.android.libraries.social.peoplekit.common.dataservice.PeopleKitDataLayer
    public final void i(Set<Channel> set) {
        w();
        Loggable[] loggableArr = new Loggable[set.size()];
        int i = 0;
        for (Channel channel : set) {
            loggableArr[i] = v(channel);
            i++;
        }
        cxqo cxqoVar = this.f;
        PeopleKitVisualElementPath peopleKitVisualElementPath = new PeopleKitVisualElementPath();
        peopleKitVisualElementPath.a(new czhc(dhjm.F));
        peopleKitVisualElementPath.c(this.b.d());
        cxqoVar.d(1, peopleKitVisualElementPath);
        AndroidLibAutocompleteSession androidLibAutocompleteSession = this.a;
        androidLibAutocompleteSession.q(7, null, null, androidLibAutocompleteSession.i(loggableArr));
    }

    @Override // com.google.android.libraries.social.peoplekit.common.dataservice.PeopleKitDataLayer
    public final void j(int i, Set<Channel> set) {
        boolean z;
        w();
        int i2 = 0;
        if (i == 1 || i == 2) {
            cxqo cxqoVar = this.f;
            PeopleKitVisualElementPath peopleKitVisualElementPath = new PeopleKitVisualElementPath();
            peopleKitVisualElementPath.a(new czhc(dhjm.M));
            peopleKitVisualElementPath.c(this.b.d());
            cxqoVar.d(1, peopleKitVisualElementPath);
            z = true;
        } else {
            z = false;
        }
        Stopwatch a = this.f.a("TimeToSend");
        if (a.c) {
            a.d();
            cxqo cxqoVar2 = this.f;
            eazd bZ = eaze.g.bZ();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            eaze eazeVar = (eaze) bZ.b;
            eazeVar.b = 4;
            eazeVar.a |= 1;
            eazh bZ2 = eazi.e.bZ();
            int i3 = z ? 14 : 15;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            eazi eaziVar = (eazi) bZ2.b;
            eaziVar.b = i3 - 1;
            eaziVar.a |= 1;
            long a2 = a.a();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            eazi eaziVar2 = (eazi) bZ2.b;
            eaziVar2.a |= 2;
            eaziVar2.c = a2;
            int i4 = this.f.i();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            eazi eaziVar3 = (eazi) bZ2.b;
            int i5 = i4 - 1;
            if (i4 == 0) {
                throw null;
            }
            eaziVar3.d = i5;
            eaziVar3.a |= 4;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            eaze eazeVar2 = (eaze) bZ.b;
            eazi bK = bZ2.bK();
            bK.getClass();
            eazeVar2.e = bK;
            eazeVar2.a |= 8;
            eazk bZ3 = eazl.e.bZ();
            int g = this.f.g();
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            eazl eazlVar = (eazl) bZ3.b;
            int i6 = g - 1;
            if (g != 0) {
                eazlVar.b = i6;
                eazlVar.a |= 1;
                eazl eazlVar2 = (eazl) bZ3.b;
                eazlVar2.c = 1;
                eazlVar2.a |= 2;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                eaze eazeVar3 = (eaze) bZ.b;
                eazl bK2 = bZ3.bK();
                bK2.getClass();
                eazeVar3.c = bK2;
                eazeVar3.a |= 2;
                cxqoVar2.b(bZ.bK());
            } else {
                throw null;
            }
        }
        Loggable[] loggableArr = new Loggable[set.size()];
        for (Channel channel : set) {
            loggableArr[i2] = v(channel);
            i2++;
        }
        try {
            if (i == 1) {
                this.a.o(2, loggableArr);
            } else if (i != 2) {
                this.a.o(3, loggableArr);
            } else {
                this.a.o(1, loggableArr);
            }
        } catch (cxzr unused) {
        }
    }

    @Override // com.google.android.libraries.social.peoplekit.common.dataservice.PeopleKitDataLayer
    public final void k() {
        w();
        Stopwatch a = this.f.a("top_suggestions_latency");
        a.b();
        a.c();
        cxrl a2 = cxrl.a(this.b);
        if (cxsg.b() || a2.b()) {
            if (this.c.d() != null) {
                cyei cyeiVar = cyei.EMPTY;
                int ordinal = this.c.d().ordinal();
                if (ordinal == 0) {
                    this.f.h(5);
                } else if (ordinal == 1) {
                    this.f.h(4);
                } else if (ordinal == 2) {
                    this.f.h(3);
                }
            } else {
                this.f.h(1);
            }
            this.a.e("");
            return;
        }
        this.f.h(2);
        cxra a3 = cxrb.a();
        a3.a = 0;
        a3.b = true;
        a3.c = "";
        cxrb a4 = a3.a();
        x(0);
        for (cxri cxriVar : this.d) {
            cxriVar.s(a2.c(), a4);
        }
        if (!a2.b.isEmpty() && System.currentTimeMillis() - a2.c < cxrl.a) {
            return;
        }
        this.a.e("");
    }

    @Override // com.google.android.libraries.social.peoplekit.common.dataservice.PeopleKitDataLayer
    public final void l(String str) {
        w();
        Stopwatch a = this.f.a("auto_latency");
        a.b();
        a.c();
        this.a.e(str);
    }

    @Override // com.google.android.libraries.social.peoplekit.common.dataservice.PeopleKitDataLayer
    public final void m() {
        w();
        this.f.a("device_latency").c();
        if (cxsg.f.f().booleanValue()) {
            deha.q(this.a.r(), new cxrt(this), dege.a);
            return;
        }
        cxsc cxscVar = (cxsc) this.e;
        cxscVar.k = 0;
        cxscVar.f.a(new cxrz(cxscVar));
    }

    @Override // com.google.android.libraries.social.peoplekit.common.dataservice.PeopleKitDataLayer
    public final Channel n(czha czhaVar) {
        String str;
        String f = this.b.f();
        cxrn C = PopulousChannel.C();
        String str2 = czhaVar.c;
        czgz b = czgz.b(czhaVar.b);
        if (b == null) {
            b = czgz.UNKNOWN_TYPE;
        }
        C.b(str2, cxrc.e(b));
        if ((czhaVar.a & 4) != 0) {
            czgu czguVar = czhaVar.d;
            if (czguVar == null) {
                czguVar = czgu.l;
            }
            String str3 = czguVar.b;
            czgu czguVar2 = czhaVar.d;
            if (czguVar2 == null) {
                czguVar2 = czgu.l;
            }
            boolean z = !czguVar2.e;
            czgu czguVar3 = czhaVar.d;
            if (czguVar3 == null) {
                czguVar3 = czgu.l;
            }
            C.c(str3, z, czguVar3.e);
            czgu czguVar4 = czhaVar.d;
            if (czguVar4 == null) {
                czguVar4 = czgu.l;
            }
            C.l = czguVar4.d;
            czgu czguVar5 = czhaVar.d;
            if (czguVar5 == null) {
                czguVar5 = czgu.l;
            }
            C.k = czguVar5.c;
            czgu czguVar6 = czhaVar.d;
            if (czguVar6 == null) {
                czguVar6 = czgu.l;
            }
            if ((czguVar6.a & 16) != 0) {
                czgu czguVar7 = czhaVar.d;
                if (czguVar7 == null) {
                    czguVar7 = czgu.l;
                }
                String str4 = czguVar7.f;
                czgu czguVar8 = czhaVar.d;
                if (czguVar8 == null) {
                    czguVar8 = czgu.l;
                }
                czgz b2 = czgz.b(czguVar8.g);
                if (b2 == null) {
                    b2 = czgz.UNKNOWN_TYPE;
                }
                C.d(str4, cxrc.e(b2));
            }
        }
        if ((czhaVar.a & 8) != 0) {
            czgs czgsVar = czhaVar.e;
            if (czgsVar == null) {
                czgsVar = czgs.b;
            }
            str = czgsVar.a;
        } else {
            str = "";
        }
        if (TextUtils.isEmpty(str)) {
            czgu czguVar9 = czhaVar.d;
            if (czguVar9 == null) {
                czguVar9 = czgu.l;
            }
            if (!czguVar9.b.isEmpty()) {
                czgu czguVar10 = czhaVar.d;
                if (czguVar10 == null) {
                    czguVar10 = czgu.l;
                }
                str = cxrc.f(czguVar10.b);
            }
        }
        C.j = str;
        C.q = f;
        return C.a();
    }

    @Override // com.google.android.libraries.social.peoplekit.common.dataservice.PeopleKitDataLayer
    public final Channel o(String str, Context context) {
        cxrg B = ManualChannel.B();
        B.b = str;
        return B.a(context);
    }

    @Override // com.google.android.libraries.social.peoplekit.common.dataservice.PeopleKitDataLayer
    public final Channel p(String str, String str2, Context context) {
        cxrg B = ManualChannel.B();
        B.a = str;
        B.b = str2;
        return B.a(context);
    }

    @Override // com.google.android.libraries.social.peoplekit.common.dataservice.PeopleKitDataLayer
    public final void q(Channel channel, cxrh cxrhVar) {
        cyge c = cygg.c();
        if (channel.d() == 1) {
            c.c(cygf.EMAIL);
        } else if (channel.d() == 2) {
            c.c(cygf.PHONE_NUMBER);
        } else {
            cxrhVar.a();
            return;
        }
        c.b(channel.c());
        cygg a = c.a();
        ArrayList arrayList = new ArrayList();
        arrayList.add(a);
        cybo cyboVar = this.c;
        cxzv d = cxzw.d();
        d.c(true);
        cyboVar.g(arrayList, d.a(), new cxru(channel, a, cxrhVar));
    }

    @Override // com.google.android.libraries.social.peoplekit.common.dataservice.PeopleKitDataLayer
    public final void r(boolean z) {
        this.h = false;
    }

    @Override // com.google.android.libraries.social.peoplekit.common.dataservice.PeopleKitDataLayer
    public final void s(Context context, ExecutorService executorService, cxqo cxqoVar, cxrj cxrjVar) {
        if (this.j) {
            if (!(cxrjVar instanceof cxry)) {
                throw new IllegalArgumentException("The data layer factory is not a Populous data layer factory.");
            }
            cxqoVar.f(this.b, 0);
            cybo c = ((cxry) cxrjVar).c(context, this.b, executorService);
            this.c = c;
            AndroidLibAutocompleteSession androidLibAutocompleteSession = this.a;
            dbsk.t(androidLibAutocompleteSession, "parceledSession is a required parameter");
            dbsk.b(androidLibAutocompleteSession instanceof AndroidLibAutocompleteSession, "parceledSession is of the wrong type.");
            dbsk.l(androidLibAutocompleteSession.z.equals(c.f));
            dbsk.r(androidLibAutocompleteSession.a.d(c.d), "parceledSession config (%s) is not compatible with base config (%s)", androidLibAutocompleteSession.a.e.o, c.d.e.o);
            c.e(androidLibAutocompleteSession, c.f(c.f, androidLibAutocompleteSession.a, c.l), c.c);
            cxsc cxscVar = new cxsc(context, executorService, this.c, this.b, this.g);
            this.e = cxscVar;
            cxscVar.a(this);
            this.f = cxqoVar;
            this.j = false;
        }
    }

    @Override // com.google.android.libraries.social.peoplekit.common.dataservice.PeopleKitDataLayer
    public final void t(List<Channel> list, List<Channel> list2, cxpc cxpcVar) {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        LinkedHashSet<Channel> linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(list);
        linkedHashSet.addAll(list2);
        for (Channel channel : linkedHashSet) {
            cyge c = cygg.c();
            if (channel.d() == 1) {
                c.c(cygf.EMAIL);
            } else if (channel.d() == 2) {
                c.c(cygf.PHONE_NUMBER);
            }
            c.b(channel.c());
            cygg a = c.a();
            arrayList.add(a);
            hashMap.put(a, channel);
        }
        cybo cyboVar = this.c;
        cxzv d = cxzw.d();
        d.b(false);
        cyboVar.g(arrayList, d.a(), new cxrv(hashMap, list, list2, cxpcVar, linkedHashSet));
    }

    @Override // com.google.android.libraries.social.peoplekit.common.dataservice.PeopleKitDataLayer
    public final cxsl u() {
        return new cxsl();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.g ? 1 : 0);
    }

    public PopulousDataLayer(cxrx cxrxVar) {
        this.d = new HashSet();
        this.j = false;
        this.c = cxrxVar.b;
        AndroidLibAutocompleteSession androidLibAutocompleteSession = cxrxVar.a;
        this.a = androidLibAutocompleteSession;
        androidLibAutocompleteSession.g(this);
        cxre cxreVar = cxrxVar.c;
        if (cxreVar != null) {
            this.e = cxreVar;
            cxreVar.a(this);
        }
        this.b = cxrxVar.d;
        this.f = cxrxVar.e;
        this.h = false;
        this.g = cxrxVar.f;
    }
}
