package defpackage;

import android.content.ClipData;
import android.view.ContentInfo;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: jt  reason: default package */
/* loaded from: classes3.dex */
public final class jt implements ju {
    private final ContentInfo a;

    public jt(ContentInfo contentInfo) {
        hz.g(contentInfo);
        this.a = contentInfo;
    }

    @Override // defpackage.ju
    public final int a() {
        return this.a.getFlags();
    }

    @Override // defpackage.ju
    public final int b() {
        return this.a.getSource();
    }

    @Override // defpackage.ju
    public final ClipData c() {
        return this.a.getClip();
    }

    @Override // defpackage.ju
    public final ContentInfo d() {
        return this.a;
    }

    public final String toString() {
        return "ContentInfoCompat{" + this.a + "}";
    }
}
