package defpackage;

import com.google.research.xeno.effect.AssetManager;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: ztm  reason: default package */
/* loaded from: classes4.dex */
final class ztm {
    public final AssetManager.FetchCallback a;
    public final Set b;
    public final Map c = new HashMap();

    public ztm(AssetManager.FetchCallback fetchCallback, Set set) {
        this.a = fetchCallback;
        this.b = new HashSet(set);
    }
}
