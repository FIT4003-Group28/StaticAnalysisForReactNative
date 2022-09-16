package defpackage;

import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: agsp  reason: default package */
/* loaded from: classes.dex */
public class agsp {
    protected final agvx a;
    public final String b;
    public final Object c = new Object();
    public Pair d;

    public agsp(agvx agvxVar, String str) {
        agvxVar.getClass();
        this.a = agvxVar;
        this.b = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Pair a() {
        List emptyList = Collections.emptyList();
        agqf agqfVar = null;
        if (!"PPSV".equals(this.b) || TextUtils.isEmpty(null)) {
            if (!TextUtils.isEmpty(this.b)) {
                agqh e = this.a.i().e(this.b);
                if (e != null) {
                    agqfVar = e.a;
                }
                if (agqfVar != null) {
                    emptyList = this.a.i().l(this.b);
                }
            }
        } else {
            agqv e2 = !TextUtils.isEmpty(null) ? this.a.m().e(null) : null;
            if (e2 != null) {
                emptyList = Collections.singletonList(e2);
            }
        }
        return b(agqfVar, emptyList);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Pair b(agqf agqfVar, List list) {
        Pair pair;
        synchronized (this.c) {
            pair = new Pair(agqfVar, list);
            this.d = pair;
        }
        return pair;
    }

    public final List c() {
        List list;
        synchronized (this.c) {
            Pair pair = this.d;
            if (pair == null) {
                pair = a();
            }
            list = (List) pair.second;
        }
        return list;
    }

    public final List d() {
        ArrayList arrayList;
        synchronized (this.c) {
            arrayList = new ArrayList();
            for (agqv agqvVar : c()) {
                arrayList.add(agqvVar.a);
            }
        }
        return arrayList;
    }

    public boolean e() {
        throw null;
    }
}
