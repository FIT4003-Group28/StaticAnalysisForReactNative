package defpackage;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
/* compiled from: PG */
/* renamed from: bys  reason: default package */
/* loaded from: classes.dex */
final class bys implements cjt<byt> {
    public static final byt b() {
        try {
            return new byt(MessageDigest.getInstance("SHA-256"));
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // defpackage.cjt
    public final /* bridge */ /* synthetic */ byt a() {
        return b();
    }
}
