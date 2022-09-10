package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: bcz  reason: default package */
/* loaded from: classes3.dex */
public final class bcz extends bcj {
    public final bdn a;
    public final String b;
    public final List<? extends bcn> c;
    public final List<String> d;
    public boolean e;
    public final int f;
    private final List<String> g;
    private bcg h;

    static {
        bbz.f("WorkContinuationImpl");
    }

    public bcz(bdn bdnVar, String str, int i, List<? extends bcn> list) {
        this(bdnVar, str, i, list, null);
    }

    public static Set<String> b() {
        return new HashSet();
    }

    public final bcg a() {
        if (!this.e) {
            bhb bhbVar = new bhb(this);
            this.a.k.a(bhbVar);
            this.h = bhbVar.a;
        } else {
            bbz.e();
            TextUtils.join(", ", this.d);
        }
        return this.h;
    }

    public bcz(bdn bdnVar, String str, int i, List list, byte[] bArr) {
        this.a = bdnVar;
        this.b = str;
        this.f = i;
        this.c = list;
        this.d = new ArrayList(list.size());
        this.g = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            String a = ((bcn) list.get(i2)).a();
            this.d.add(a);
            this.g.add(a);
        }
    }
}
