package defpackage;

import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: coh  reason: default package */
/* loaded from: classes2.dex */
public final class coh implements cnq {
    private static final Set a = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));
    private final cnq b;

    public coh(cnq cnqVar) {
        this.b = cnqVar;
    }

    @Override // defpackage.cnq
    public final /* bridge */ /* synthetic */ cnp a(Object obj, int i, int i2, cic cicVar) {
        return this.b.a(new cnf(((Uri) obj).toString()), i, i2, cicVar);
    }

    @Override // defpackage.cnq
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        return a.contains(((Uri) obj).getScheme());
    }
}
