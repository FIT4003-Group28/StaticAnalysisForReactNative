package defpackage;
/* compiled from: PG */
/* renamed from: apiz  reason: default package */
/* loaded from: classes2.dex */
public class apiz implements aphs {
    private final aowo a;

    public apiz(aowo aowoVar) {
        this.a = aowoVar;
    }

    @Override // defpackage.aphs
    public Boolean a() {
        return Boolean.valueOf(this.a == aowo.RECENT);
    }

    @Override // defpackage.aphs
    public Boolean b() {
        boolean z = true;
        if (this.a != aowo.CITIES && this.a != aowo.COUNTRIES) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
