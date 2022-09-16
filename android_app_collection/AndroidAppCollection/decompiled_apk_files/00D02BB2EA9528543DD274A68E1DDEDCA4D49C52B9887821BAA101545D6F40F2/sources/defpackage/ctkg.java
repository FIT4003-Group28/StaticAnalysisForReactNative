package defpackage;

import android.content.ContentValues;
import com.google.android.libraries.messaging.lighter.model.ContactId;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
/* compiled from: PG */
/* renamed from: ctkg  reason: default package */
/* loaded from: classes5.dex */
public final class ctkg {
    public static dbsg<KeyPair> a(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null) {
            return dbpy.a;
        }
        try {
            KeyFactory keyFactory = KeyFactory.getInstance("EC");
            return dbsg.i(new KeyPair(keyFactory.generatePublic(new X509EncodedKeySpec(bArr)), keyFactory.generatePrivate(new PKCS8EncodedKeySpec(bArr2))));
        } catch (NoSuchAlgorithmException | InvalidKeySpecException unused) {
            return dbpy.a;
        }
    }

    public static ContentValues b(ctyy ctyyVar, ctzp ctzpVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("tachyon_app_name", ctyyVar.e());
        contentValues.put("server_registration_id", ctyyVar.c().G());
        contentValues.put("server_registration_status", Integer.valueOf(ctyyVar.d().c));
        contentValues.put("tachyon_auth_token", deca.c(ctzpVar.a()));
        contentValues.put("auth_token_expire_at_timestamp_ms", ctzpVar.b());
        contentValues.put("auth_token_refreshed_at_timestamp_ms", ctzpVar.c());
        ContactId.ContactType contactType = ContactId.ContactType.UNKNOWN;
        int h = ctzpVar.h();
        int i = h - 1;
        if (h != 0) {
            if (i == 0) {
                contentValues.put("identity_key_type", (Integer) 0);
            } else if (i == 1) {
                contentValues.put("identity_key_type", (Integer) 1);
                contentValues.put("identity_key_private", ctzpVar.d().getPrivate().getEncoded());
                contentValues.put("identity_key_public", ctzpVar.d().getPublic().getEncoded());
            } else if (i == 2) {
                contentValues.put("identity_key_type", (Integer) 2);
                contentValues.put("identity_key_private", (byte[]) ctzpVar.e().first);
                contentValues.put("identity_key_public", (byte[]) ctzpVar.e().second);
            }
            return contentValues;
        }
        throw null;
    }
}
