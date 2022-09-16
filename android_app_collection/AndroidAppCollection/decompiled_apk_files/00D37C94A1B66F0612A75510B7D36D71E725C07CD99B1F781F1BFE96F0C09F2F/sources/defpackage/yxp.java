package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Comparator;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: yxp  reason: default package */
/* loaded from: classes4.dex */
public final class yxp implements ynl {
    public static final Comparator a = utr.e;
    public final Map b;
    public final Map c = new ConcurrentHashMap();
    public final Executor d;

    public yxp(Map map, Executor executor) {
        this.b = map;
        this.d = executor;
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                yxq yxqVar = (yxq) obj;
                this.d.execute(new yxo(this));
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return new Class[]{yxq.class};
    }
}
