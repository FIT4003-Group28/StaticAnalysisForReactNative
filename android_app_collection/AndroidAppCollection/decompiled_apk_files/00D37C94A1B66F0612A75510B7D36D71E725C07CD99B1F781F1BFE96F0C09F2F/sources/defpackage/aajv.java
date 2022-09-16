package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: aajv  reason: default package */
/* loaded from: classes.dex */
public final class aajv implements aajj {
    private final String a;
    private final byte[] b;
    private final aaju c;

    public aajv(String str, byte[] bArr) {
        this.a = str;
        this.b = bArr;
        this.c = new aaju(str);
    }

    public static aajt b(String str, byte[] bArr) {
        aajt aajtVar = new aajt();
        aajtVar.b = str;
        aajtVar.a = bArr;
        return aajtVar;
    }

    @Override // defpackage.aajj
    public final /* synthetic */ amvn a() {
        return amyg.a;
    }

    @Override // defpackage.aajj
    public final byte[] c() {
        return this.b;
    }

    @Override // defpackage.aajj
    public final String d() {
        return this.a;
    }

    @Override // defpackage.aajj
    public final /* bridge */ /* synthetic */ abga e() {
        aajt aajtVar = new aajt();
        aajtVar.a = this.b;
        aajtVar.b = this.a;
        return aajtVar;
    }

    @Override // defpackage.aajj
    public final boolean equals(Object obj) {
        if (obj instanceof aajv) {
            aajv aajvVar = (aajv) obj;
            if (akzj.f(this.a, aajvVar.a) && Arrays.equals(this.b, aajvVar.b)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.aajj
    /* renamed from: getType  reason: collision with other method in class */
    public aaju mo145getType() {
        return this.c;
    }

    @Override // defpackage.aajj
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(Arrays.hashCode(this.b))});
    }
}
