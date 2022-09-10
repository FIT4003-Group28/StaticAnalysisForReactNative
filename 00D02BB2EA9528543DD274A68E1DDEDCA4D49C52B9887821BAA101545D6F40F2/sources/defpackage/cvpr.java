package defpackage;

import com.google.android.filament.R;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: cvpr  reason: default package */
/* loaded from: classes5.dex */
public final class cvpr extends cvpu {
    private final int a;
    private final coye b;
    private final String c;
    private final dcep<String> d;
    private final byte[] e;

    public cvpr(int i, coye coyeVar, String str, dcep<String> dcepVar, byte[] bArr) {
        this.a = i;
        this.b = coyeVar;
        this.c = str;
        this.d = dcepVar;
        this.e = bArr;
    }

    @Override // defpackage.cvpu
    public final int a() {
        return this.a;
    }

    @Override // defpackage.cvpu
    public final coye b() {
        return this.b;
    }

    @Override // defpackage.cvpu
    public final String c() {
        return this.c;
    }

    @Override // defpackage.cvpu
    public final dcep<String> d() {
        return this.d;
    }

    @Override // defpackage.cvpu
    public final byte[] e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cvpu) {
            cvpu cvpuVar = (cvpu) obj;
            if (this.a == cvpuVar.a() && this.b.equals(cvpuVar.b()) && this.c.equals(cvpuVar.c()) && this.d.equals(cvpuVar.d())) {
                if (Arrays.equals(this.e, cvpuVar instanceof cvpr ? ((cvpr) cvpuVar).e : cvpuVar.e())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ Arrays.hashCode(this.e);
    }

    public final String toString() {
        int i = this.a;
        String valueOf = String.valueOf(this.b);
        String str = this.c;
        String valueOf2 = String.valueOf(this.d);
        String arrays = Arrays.toString(this.e);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(str).length();
        int length3 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + R.styleable.AppCompatTheme_windowActionBarOverlay + length2 + length3 + String.valueOf(arrays).length());
        sb.append("PhenotypeConfig{appVersionCode=");
        sb.append(i);
        sb.append(", phenotypeFlagCommitter=");
        sb.append(valueOf);
        sb.append(", packageName=");
        sb.append(str);
        sb.append(", logSourceNames=");
        sb.append(valueOf2);
        sb.append(", deviceProperties=");
        sb.append(arrays);
        sb.append("}");
        return sb.toString();
    }
}
