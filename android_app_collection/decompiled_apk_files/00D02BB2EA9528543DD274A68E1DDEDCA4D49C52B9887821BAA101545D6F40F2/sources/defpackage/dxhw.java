package defpackage;

import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: dxhw  reason: default package */
/* loaded from: classes6.dex */
public final class dxhw {
    public final dxhz a;
    public String[] b;
    public final Map<String, String> c = new HashMap();

    public dxhw(dxhz dxhzVar) {
        if (dxhzVar != null) {
            this.a = dxhzVar;
            return;
        }
        throw new IllegalArgumentException("Response type can't be null");
    }
}
