package defpackage;

import com.google.android.libraries.messaging.lighter.model.ContactId;
/* compiled from: PG */
/* renamed from: ctji  reason: default package */
/* loaded from: classes5.dex */
abstract class ctji extends dbrh<ContactId.ContactType, ctjo> {
    @Override // defpackage.dbrh
    protected final /* bridge */ /* synthetic */ ContactId.ContactType b(ctjo ctjoVar) {
        ctjo ctjoVar2 = ctjoVar;
        ContactId.ContactType contactType = ContactId.ContactType.UNKNOWN;
        int ordinal = ctjoVar2.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return ContactId.ContactType.PHONE_NUMBER;
            }
            if (ordinal == 2) {
                return ContactId.ContactType.EMAIL;
            }
            if (ordinal == 3) {
                return ContactId.ContactType.HANDLER;
            }
            if (ordinal == 4) {
                return d();
            }
            if (ordinal == 5) {
                return ContactId.ContactType.DEVICE_ID;
            }
            String valueOf = String.valueOf(ctjoVar2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
            sb.append("unknown enum value: ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        }
        return ContactId.ContactType.UNKNOWN;
    }

    @Override // defpackage.dbrh
    protected final /* bridge */ /* synthetic */ ctjo c(ContactId.ContactType contactType) {
        ContactId.ContactType contactType2 = contactType;
        ctjo ctjoVar = ctjo.UNKNOWN;
        int ordinal = contactType2.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return ctjo.PHONE_NUMBER;
            }
            if (ordinal == 2) {
                return ctjo.EMAIL;
            }
            if (ordinal == 3) {
                return ctjo.HANDLER;
            }
            if (ordinal == 4) {
                return ctjo.DEVICE_ID;
            }
            String valueOf = String.valueOf(contactType2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
            sb.append("unknown enum value: ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        }
        return ctjo.UNKNOWN;
    }

    public abstract ContactId.ContactType d();
}
