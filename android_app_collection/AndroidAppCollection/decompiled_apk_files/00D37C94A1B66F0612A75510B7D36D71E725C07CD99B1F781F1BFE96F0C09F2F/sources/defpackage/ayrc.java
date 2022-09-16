package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: ayrc  reason: default package */
/* loaded from: classes2.dex */
public final class ayrc implements aypy {
    public static final /* synthetic */ ayrc a = new ayrc(1);
    private final /* synthetic */ int b;

    public ayrc() {
    }

    private /* synthetic */ ayrc(int i) {
        this.b = i;
    }

    @Override // defpackage.aypy
    public final boolean a(Object obj, Object obj2) {
        if (this.b == 0) {
            return ayrd.a(obj, obj2);
        }
        return Arrays.equals((byte[]) obj, (byte[]) obj2);
    }
}
