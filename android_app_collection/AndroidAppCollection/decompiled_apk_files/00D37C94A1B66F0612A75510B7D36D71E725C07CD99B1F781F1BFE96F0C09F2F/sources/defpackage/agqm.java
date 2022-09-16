package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import java.util.List;
/* compiled from: PG */
/* renamed from: agqm  reason: default package */
/* loaded from: classes.dex */
public final class agqm {
    public final agql a;
    public final agql b;
    public final long c;
    public final long d;
    public final boolean e;
    public final String f;
    public final boolean g;
    private final agql h;

    public agqm(agql agqlVar, agql agqlVar2, boolean z) {
        long j;
        agql agqlVar3 = agqlVar == null ? agqlVar2 : agqlVar;
        agqlVar3.getClass();
        this.h = agqlVar3;
        this.a = agqlVar;
        this.b = agqlVar2;
        this.e = z;
        long j2 = 0;
        if (agqlVar == null) {
            agqlVar = null;
            j = 0;
        } else {
            j = agqlVar.d;
        }
        this.c = j + (agqlVar2 == null ? 0L : agqlVar2.d);
        this.d = (agqlVar == null ? 0L : agqlVar.b()) + (agqlVar2 != null ? agqlVar2.b() : j2);
        this.f = agqlVar3.l;
        String str = agqlVar3.l;
        boolean z2 = false;
        if (!TextUtils.isEmpty(str) && !str.startsWith("0000-0000")) {
            z2 = true;
        }
        this.g = z2;
    }

    public static agqm e(agql agqlVar, agql agqlVar2) {
        return new agqm(agqlVar, agqlVar2, true);
    }

    public final FormatStreamModel a() {
        agql agqlVar = this.b;
        if (agqlVar != null) {
            return agqlVar.b;
        }
        return null;
    }

    public final FormatStreamModel b(List list) {
        agql agqlVar = this.b;
        if (agqlVar == null || !agqlVar.i() || !this.b.j(list)) {
            return null;
        }
        return this.b.b;
    }

    public final FormatStreamModel c() {
        agql agqlVar = this.a;
        if (agqlVar != null) {
            return agqlVar.b;
        }
        return null;
    }

    public final FormatStreamModel d(List list) {
        agql agqlVar = this.a;
        if (agqlVar == null || !agqlVar.i() || !this.a.j(list)) {
            return null;
        }
        return this.a.b;
    }

    public final String f() {
        return this.h.g();
    }
}
