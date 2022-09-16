package defpackage;

import java.io.Serializable;
import java.util.List;
/* compiled from: PG */
/* renamed from: aabb  reason: default package */
/* loaded from: classes2.dex */
public final class aabb implements Serializable {
    public final bvrt<aaam> a;
    public final bwrs<aacn> b;
    public final bwrs<aaco> c;
    public final dcdc<bwrs<aaco>> d;

    public aabb(aaam aaamVar, aacn aacnVar, aaco aacoVar, List<aaco> list) {
        this.a = bvrt.b(aaamVar);
        this.b = bwrs.a(aacnVar);
        this.c = bwrs.a(aacoVar);
        this.d = dcbg.b(list).s(aaba.a).z();
    }
}
