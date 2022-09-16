package defpackage;

import java.util.ArrayList;
import java.util.Collection;
/* compiled from: PG */
/* renamed from: fsl  reason: default package */
/* loaded from: classes3.dex */
public final class fsl {
    public final CharSequence a;
    public final Collection b;

    public fsl() {
        this("");
    }

    public fsl(CharSequence charSequence) {
        this(charSequence, new ArrayList());
    }

    public fsl(CharSequence charSequence, Collection collection) {
        this.a = charSequence;
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        arrayList.addAll(collection);
    }
}
