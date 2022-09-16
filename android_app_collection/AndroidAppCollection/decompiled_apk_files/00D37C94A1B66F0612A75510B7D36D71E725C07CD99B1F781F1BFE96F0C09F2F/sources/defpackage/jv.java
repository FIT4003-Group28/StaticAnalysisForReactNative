package defpackage;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
/* compiled from: PG */
/* renamed from: jv  reason: default package */
/* loaded from: classes3.dex */
final class jv implements ju {
    private final ClipData a;
    private final int b;
    private final int c;
    private final Uri d;
    private final Bundle e;

    public jv(js jsVar) {
        ClipData clipData = jsVar.a;
        hz.g(clipData);
        this.a = clipData;
        this.b = jsVar.b;
        this.c = jsVar.c;
        this.d = jsVar.d;
        this.e = jsVar.e;
    }

    @Override // defpackage.ju
    public final int a() {
        return this.c;
    }

    @Override // defpackage.ju
    public final int b() {
        return this.b;
    }

    @Override // defpackage.ju
    public final ClipData c() {
        return this.a;
    }

    @Override // defpackage.ju
    public final ContentInfo d() {
        return null;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("ContentInfoCompat{clip=");
        sb.append(this.a.getDescription());
        sb.append(", source=");
        int i = this.b;
        sb.append(i != 1 ? i != 2 ? "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD");
        sb.append(", flags=");
        sb.append(1 != this.c ? "0" : "FLAG_CONVERT_TO_PLAIN_TEXT");
        String str2 = "";
        if (this.d == null) {
            str = str2;
        } else {
            str = ", hasLinkUri(" + this.d.toString().length() + ")";
        }
        sb.append(str);
        if (this.e != null) {
            str2 = ", hasExtras";
        }
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }
}
