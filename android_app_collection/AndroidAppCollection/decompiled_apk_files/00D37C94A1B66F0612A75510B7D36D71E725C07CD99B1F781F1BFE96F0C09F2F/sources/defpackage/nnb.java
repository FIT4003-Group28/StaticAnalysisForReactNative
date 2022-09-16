package defpackage;

import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: nnb  reason: default package */
/* loaded from: classes3.dex */
public final class nnb {
    public final azqb a;
    public final azqb b;
    public final npg c;
    public final Map d = new HashMap();
    public nml e;

    public nnb(azqb azqbVar, azqb azqbVar2, npg npgVar) {
        this.a = azqbVar;
        this.b = azqbVar2;
        this.c = npgVar;
    }

    public final nmx a(String str) {
        return (nmx) this.d.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean b(String str) {
        return a(str) != null;
    }
}
