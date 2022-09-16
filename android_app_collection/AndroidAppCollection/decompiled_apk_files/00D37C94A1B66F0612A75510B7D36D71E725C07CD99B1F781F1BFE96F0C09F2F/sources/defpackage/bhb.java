package defpackage;

import android.content.ComponentName;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: bhb  reason: default package */
/* loaded from: classes2.dex */
public final class bhb {
    final bgk a;
    final List b = new ArrayList();
    public bgm c;
    private final bgi d;

    public bhb(bgk bgkVar) {
        this.a = bgkVar;
        this.d = bgkVar.f;
    }

    public final ComponentName a() {
        return this.d.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final bhc b(String str) {
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            if (((bhc) this.b.get(i)).b.equals(str)) {
                return (bhc) this.b.get(i);
            }
        }
        return null;
    }

    public final String c() {
        return this.d.a();
    }

    public final String toString() {
        return "MediaRouter.RouteProviderInfo{ packageName=" + c() + " }";
    }
}
