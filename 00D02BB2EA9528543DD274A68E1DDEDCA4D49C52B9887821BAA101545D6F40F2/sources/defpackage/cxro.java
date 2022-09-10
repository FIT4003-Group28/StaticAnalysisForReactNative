package defpackage;

import com.google.android.libraries.social.peoplekit.common.dataservice.AutocompleteMatchInfo;
import com.google.android.libraries.social.peoplekit.common.dataservice.populous.PopulousChannel;
import com.google.android.libraries.social.populous.Person;
import com.google.android.libraries.social.populous.core.ContactMethodField;
import com.google.android.libraries.social.populous.core.InAppNotificationTarget;
import com.google.android.libraries.social.populous.core.MatchInfo;
import com.google.android.libraries.social.populous.core.Name;
import com.google.android.libraries.social.populous.core.Photo;
/* compiled from: PG */
/* renamed from: cxro  reason: default package */
/* loaded from: classes5.dex */
public final class cxro {
    public static cxrn a(Person person, ContactMethodField contactMethodField, String str) {
        cxrn C = PopulousChannel.C();
        C.b(contactMethodField.a().toString(), b(contactMethodField));
        C.r = contactMethodField;
        if (contactMethodField instanceof InAppNotificationTarget) {
            InAppNotificationTarget j = contactMethodField.j();
            String i = j.b().i();
            if ((j.SA() == cyep.IN_APP_EMAIL || j.SA() == cyep.IN_APP_PHONE || j.SA() == cyep.IN_APP_GAIA) && i == null) {
                i = j.e();
            }
            C.l = i;
        } else {
            C.l = contactMethodField.b().i();
        }
        int i2 = 0;
        if (contactMethodField.SA() == cyep.IN_APP_NOTIFICATION_TARGET && !contactMethodField.j().d().isEmpty()) {
            ContactMethodField contactMethodField2 = contactMethodField.j().d().get(0);
            C.d(contactMethodField2.a().toString(), b(contactMethodField2));
        }
        dcdc<MatchInfo> dcdcVar = contactMethodField.b().n;
        if (dcdcVar != null && !dcdcVar.isEmpty()) {
            MatchInfo matchInfo = dcdcVar.get(0);
            C.d = new AutocompleteMatchInfo(matchInfo.a(), matchInfo.b());
        }
        Name name = null;
        if (cxsg.a.f().booleanValue()) {
            Name[] k = person.k();
            int length = k.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                }
                Name name2 = k[i3];
                if (contactMethodField.b().j(name2.b())) {
                    name = name2;
                    break;
                }
                i3++;
            }
        } else if (person.k().length > 0) {
            name = person.k()[0];
        }
        if (name != null) {
            if (name.a() != null) {
                C.c(name.a().toString(), !cyeq.c(name.b().d()), cyeq.c(name.b().d()));
                C.j = cxrc.f(name.a().toString());
            }
            if (name.c() != null) {
                C.f = name.c().toString();
            }
            dcdc<MatchInfo> dcdcVar2 = name.b().n;
            if (dcdcVar2 != null && !dcdcVar2.isEmpty()) {
                MatchInfo matchInfo2 = dcdcVar2.get(0);
                C.i = new AutocompleteMatchInfo(matchInfo2.a(), matchInfo2.b());
            }
        }
        Photo[] n = person.n();
        int length2 = n.length;
        while (true) {
            if (i2 >= length2) {
                break;
            }
            Photo photo = n[i2];
            if (contactMethodField.b().j(photo.b())) {
                C.k = photo.c();
                break;
            }
            i2++;
        }
        C.q = str;
        return C;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(ContactMethodField contactMethodField) {
        cyep cyepVar = cyep.EMAIL;
        int ordinal = contactMethodField.SA().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return 2;
            }
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return 5;
                }
                if (ordinal == 4) {
                    return 4;
                }
                return ordinal != 5 ? 0 : 3;
            }
            int g = contactMethodField.j().g();
            if (g == 2) {
                return 4;
            }
            if (g == 4) {
                return 5;
            }
            return g == 3 ? 3 : 0;
        }
        return 1;
    }
}
