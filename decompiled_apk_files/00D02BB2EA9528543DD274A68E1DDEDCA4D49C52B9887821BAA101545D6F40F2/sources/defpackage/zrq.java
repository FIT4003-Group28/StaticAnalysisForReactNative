package defpackage;

import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: zrq  reason: default package */
/* loaded from: classes7.dex */
public class zrq implements zcu {
    private final List<zcv> a;
    @dzsi
    private final Runnable b;

    private zrq(List<zcv> list, @dzsi Runnable runnable) {
        this.a = list;
        this.b = runnable;
    }

    public static zrq c(zcv zcvVar, @dzsi Runnable runnable) {
        return new zrq(Collections.singletonList(zcvVar), runnable);
    }

    public static zrq d(List<zcv> list, @dzsi Runnable runnable) {
        return new zrq(list, null);
    }

    @Override // defpackage.zcu
    public List<zcv> a() {
        return this.a;
    }

    @Override // defpackage.zcu
    public cqkl b() {
        Runnable runnable = this.b;
        if (runnable != null) {
            runnable.run();
        }
        return cqkl.a;
    }
}
