package defpackage;
/* compiled from: PG */
/* renamed from: dtbh  reason: default package */
/* loaded from: classes6.dex */
public enum dtbh implements dsrb {
    UNKNOWN_OPERATION(0),
    NEW_UPLOAD(1),
    IMPORT(2),
    UPDATE(3),
    DELETE(4);
    
    public final int f;

    dtbh(int i) {
        this.f = i;
    }

    public static dtbh b(int i) {
        if (i != 0) {
            if (i == 1) {
                return NEW_UPLOAD;
            }
            if (i == 2) {
                return IMPORT;
            }
            if (i == 3) {
                return UPDATE;
            }
            if (i == 4) {
                return DELETE;
            }
            return null;
        }
        return UNKNOWN_OPERATION;
    }

    public static dsrd c() {
        return dtbg.a;
    }

    @Override // defpackage.dsrb
    public final int a() {
        return this.f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f);
    }
}
