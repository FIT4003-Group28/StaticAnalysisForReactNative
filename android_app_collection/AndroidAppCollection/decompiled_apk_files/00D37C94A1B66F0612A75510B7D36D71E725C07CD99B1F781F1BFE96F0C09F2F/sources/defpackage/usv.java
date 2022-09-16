package defpackage;

import com.google.android.libraries.parenttools.youtube.AutoValue_ParentToolsResult;
import com.google.android.libraries.parenttools.youtube.ParentToolsResult;
/* compiled from: PG */
/* renamed from: usv  reason: default package */
/* loaded from: classes4.dex */
public final class usv {
    public byte[] a;
    private int b;

    public usv() {
    }

    public usv(ParentToolsResult parentToolsResult) {
        AutoValue_ParentToolsResult autoValue_ParentToolsResult = (AutoValue_ParentToolsResult) parentToolsResult;
        this.a = autoValue_ParentToolsResult.a;
        this.b = autoValue_ParentToolsResult.b;
    }

    public final ParentToolsResult a() {
        int i = this.b;
        if (i == 0) {
            throw new IllegalStateException("Missing required properties: exitStatus");
        }
        return new AutoValue_ParentToolsResult(this.a, i);
    }

    public final void b(int i) {
        if (i != 0) {
            this.b = i;
            return;
        }
        throw new NullPointerException("Null exitStatus");
    }
}
