package defpackage;

import android.view.View;
import defpackage.acl;
/* compiled from: PG */
/* renamed from: cuwk  reason: default package */
/* loaded from: classes5.dex */
public final class cuwk<ChildHolderT extends acl> extends acl {
    final ChildHolderT s;

    public cuwk(ChildHolderT childholdert) {
        super(childholdert.a);
        this.s = childholdert;
    }

    public cuwk(View view) {
        super(view);
        this.s = null;
    }
}
