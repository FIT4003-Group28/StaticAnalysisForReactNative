package defpackage;

import com.google.android.odml.image.ImageProperties;
/* compiled from: PG */
/* renamed from: alqu  reason: default package */
/* loaded from: classes.dex */
public final class alqu extends ImageProperties.Builder {
    private Integer a;
    private Integer b;

    final ImageProperties.Builder setImageFormat(int i) {
        this.a = Integer.valueOf(i);
        return this;
    }

    final ImageProperties.Builder setStorageType(int i) {
        this.b = Integer.valueOf(i);
        return this;
    }

    final ImageProperties build() {
        Integer num = this.a;
        if (num == null || this.b == null) {
            StringBuilder sb = new StringBuilder();
            if (this.a == null) {
                sb.append(" imageFormat");
            }
            if (this.b == null) {
                sb.append(" storageType");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new alqv(num.intValue(), this.b.intValue());
    }
}
