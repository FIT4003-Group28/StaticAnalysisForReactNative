package defpackage;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: cmg  reason: default package */
/* loaded from: classes2.dex */
public final class cmg implements cvg {
    private final /* synthetic */ int a;

    public cmg() {
    }

    public cmg(int i) {
        this.a = i;
    }

    public static final cmh b() {
        try {
            return new cmh(MessageDigest.getInstance("SHA-256"));
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // defpackage.cvg
    public final /* bridge */ /* synthetic */ Object a() {
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                return new ckt();
            }
            return new ArrayList();
        }
        return b();
    }
}
