package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: aijl  reason: default package */
/* loaded from: classes.dex */
public final class aijl {
    public apzg a;
    public int b;
    List c;
    public boolean d;
    public boolean e;
    public boolean f;
    Boolean g;
    Boolean h;
    public Boolean i;
    Boolean j;
    public ory m;
    public String n;
    public String o;
    public long k = -1;
    public int p = 1;
    final orw l = orw.AUDIO_ROUTE_UNSPECIFIED;

    public final PlaybackStartDescriptor a() {
        aopa mo52toBuilder;
        boolean z;
        ory oryVar;
        if (this.m != null) {
            aqxo.q(this.c == null, "Only one of localProto, command, videoIdList can be set");
            if (this.a == null) {
                ory oryVar2 = this.m;
                apzg apzgVar = null;
                if (oryVar2 != null && (oryVar2.b & 524288) != 0) {
                    try {
                        apzgVar = (apzg) aopi.parseFrom(apzg.a, oryVar2.t.I(), aoos.b());
                    } catch (aopx unused) {
                    }
                }
                this.a = apzgVar;
            }
        } else if (this.a != null) {
            aqxo.q(this.c == null, "Only one of localProto, command, videoIdList can be set");
        }
        if (this.n != null || this.o != null) {
            aqxo.q(this.m != null, "Can only set videoId/playlistId/playerParams when localProto is set");
        }
        ory oryVar3 = this.m;
        if (oryVar3 == null) {
            apzg apzgVar2 = this.a;
            if (apzgVar2 != null) {
                aijm a = aijn.a(apzgVar2);
                if (a != null) {
                    oryVar = a.h(apzgVar2);
                } else {
                    oryVar = ory.a;
                }
                mo52toBuilder = oryVar.mo52toBuilder();
                aoob x = aoob.x(apzgVar2.toByteArray());
                mo52toBuilder.copyOnWrite();
                ory oryVar4 = (ory) mo52toBuilder.instance;
                oryVar4.b = 524288 | oryVar4.b;
                oryVar4.t = x;
                if (apzgVar2.qn(WatchEndpointOuterClass.watchEndpoint)) {
                    int R = awwc.R(((awel) apzgVar2.qm(WatchEndpointOuterClass.watchEndpoint)).m);
                    if (R == 0) {
                        R = 1;
                    }
                    this.p = R;
                    this.j = Boolean.valueOf(((awel) apzgVar2.qm(WatchEndpointOuterClass.watchEndpoint)).u);
                }
                aoob aoobVar = apzgVar2.c;
                mo52toBuilder.copyOnWrite();
                ory oryVar5 = (ory) mo52toBuilder.instance;
                aoobVar.getClass();
                oryVar5.b |= 16;
                oryVar5.h = aoobVar;
            } else if (this.c != null) {
                mo52toBuilder = ory.a.createBuilder();
                List list = this.c;
                mo52toBuilder.copyOnWrite();
                ory oryVar6 = (ory) mo52toBuilder.instance;
                aopu aopuVar = oryVar6.d;
                if (!aopuVar.c()) {
                    oryVar6.d = aopi.mutableCopy(aopuVar);
                }
                aonk.addAll((Iterable) list, (List) oryVar6.d);
                mo52toBuilder.copyOnWrite();
                ory oryVar7 = (ory) mo52toBuilder.instance;
                oryVar7.b |= 2;
                oryVar7.e = "";
                int i = this.b;
                if (i < 0) {
                    if (i == -1) {
                        i = -1;
                    }
                    z = false;
                    aqxo.y(z);
                    String str = (String) this.c.get(Math.max(0, this.b));
                    mo52toBuilder.copyOnWrite();
                    ory oryVar8 = (ory) mo52toBuilder.instance;
                    str.getClass();
                    oryVar8.b |= 1;
                    oryVar8.c = str;
                    int i2 = this.b;
                    mo52toBuilder.copyOnWrite();
                    ory oryVar9 = (ory) mo52toBuilder.instance;
                    oryVar9.b |= 4;
                    oryVar9.f = i2;
                    mo52toBuilder.copyOnWrite();
                    ory oryVar10 = (ory) mo52toBuilder.instance;
                    oryVar10.b |= 64;
                    oryVar10.j = false;
                    mo52toBuilder.copyOnWrite();
                    ory oryVar11 = (ory) mo52toBuilder.instance;
                    oryVar11.b |= 32;
                    oryVar11.i = false;
                }
                if (i < this.c.size()) {
                    z = true;
                    aqxo.y(z);
                    String str2 = (String) this.c.get(Math.max(0, this.b));
                    mo52toBuilder.copyOnWrite();
                    ory oryVar82 = (ory) mo52toBuilder.instance;
                    str2.getClass();
                    oryVar82.b |= 1;
                    oryVar82.c = str2;
                    int i22 = this.b;
                    mo52toBuilder.copyOnWrite();
                    ory oryVar92 = (ory) mo52toBuilder.instance;
                    oryVar92.b |= 4;
                    oryVar92.f = i22;
                    mo52toBuilder.copyOnWrite();
                    ory oryVar102 = (ory) mo52toBuilder.instance;
                    oryVar102.b |= 64;
                    oryVar102.j = false;
                    mo52toBuilder.copyOnWrite();
                    ory oryVar112 = (ory) mo52toBuilder.instance;
                    oryVar112.b |= 32;
                    oryVar112.i = false;
                }
                z = false;
                aqxo.y(z);
                String str22 = (String) this.c.get(Math.max(0, this.b));
                mo52toBuilder.copyOnWrite();
                ory oryVar822 = (ory) mo52toBuilder.instance;
                str22.getClass();
                oryVar822.b |= 1;
                oryVar822.c = str22;
                int i222 = this.b;
                mo52toBuilder.copyOnWrite();
                ory oryVar922 = (ory) mo52toBuilder.instance;
                oryVar922.b |= 4;
                oryVar922.f = i222;
                mo52toBuilder.copyOnWrite();
                ory oryVar1022 = (ory) mo52toBuilder.instance;
                oryVar1022.b |= 64;
                oryVar1022.j = false;
                mo52toBuilder.copyOnWrite();
                ory oryVar1122 = (ory) mo52toBuilder.instance;
                oryVar1122.b |= 32;
                oryVar1122.i = false;
            } else {
                mo52toBuilder = ory.a.createBuilder();
            }
        } else {
            mo52toBuilder = oryVar3.mo52toBuilder();
        }
        boolean z2 = this.d;
        mo52toBuilder.copyOnWrite();
        ory oryVar12 = (ory) mo52toBuilder.instance;
        oryVar12.b |= 4096;
        oryVar12.p = z2;
        boolean z3 = this.e;
        mo52toBuilder.copyOnWrite();
        ory oryVar13 = (ory) mo52toBuilder.instance;
        oryVar13.b |= 4194304;
        oryVar13.v = z3;
        boolean z4 = this.f;
        mo52toBuilder.copyOnWrite();
        ory oryVar14 = (ory) mo52toBuilder.instance;
        oryVar14.b |= 2097152;
        oryVar14.u = z4;
        long j = this.k;
        if (j > -1) {
            mo52toBuilder.copyOnWrite();
            ory oryVar15 = (ory) mo52toBuilder.instance;
            oryVar15.b |= 256;
            oryVar15.l = j;
        }
        Boolean bool = this.g;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            mo52toBuilder.copyOnWrite();
            ory oryVar16 = (ory) mo52toBuilder.instance;
            oryVar16.b |= 1024;
            oryVar16.n = booleanValue;
        }
        Boolean bool2 = this.i;
        if (bool2 != null) {
            boolean booleanValue2 = bool2.booleanValue();
            mo52toBuilder.copyOnWrite();
            ory oryVar17 = (ory) mo52toBuilder.instance;
            oryVar17.b |= 64;
            oryVar17.j = booleanValue2;
        }
        Boolean bool3 = this.h;
        if (bool3 != null) {
            boolean booleanValue3 = bool3.booleanValue();
            mo52toBuilder.copyOnWrite();
            ory oryVar18 = (ory) mo52toBuilder.instance;
            oryVar18.b |= 2048;
            oryVar18.o = booleanValue3;
        }
        String str3 = this.n;
        if (str3 != null) {
            mo52toBuilder.copyOnWrite();
            ory oryVar19 = (ory) mo52toBuilder.instance;
            oryVar19.b = 1 | oryVar19.b;
            oryVar19.c = str3;
        }
        String str4 = this.o;
        if (str4 != null) {
            mo52toBuilder.copyOnWrite();
            ory oryVar20 = (ory) mo52toBuilder.instance;
            oryVar20.b |= 512;
            oryVar20.m = str4;
        }
        if (this.l != orw.AUDIO_ROUTE_UNSPECIFIED) {
            orw orwVar = this.l;
            mo52toBuilder.copyOnWrite();
            ory oryVar21 = (ory) mo52toBuilder.instance;
            oryVar21.w = orwVar.d;
            oryVar21.b |= 33554432;
        }
        Boolean bool4 = this.j;
        if (bool4 != null) {
            boolean booleanValue4 = bool4.booleanValue();
            mo52toBuilder.copyOnWrite();
            ory oryVar22 = (ory) mo52toBuilder.instance;
            oryVar22.b |= 134217728;
            oryVar22.z = booleanValue4;
        }
        this.m = (ory) mo52toBuilder.mo39build();
        return new PlaybackStartDescriptor(this.m, this.p, this.a);
    }

    public final void b(boolean z) {
        this.g = Boolean.valueOf(z);
    }

    public final void c(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str);
            }
        }
        aqxo.p(!arrayList.isEmpty());
        this.c = arrayList;
    }

    public final void d() {
        this.h = true;
    }
}
