package defpackage;

import com.google.android.apps.youtube.app.application.backup.YouTubeBackupAgent;
import com.google.android.libraries.backup.Backup;
import com.google.android.libraries.youtube.common.annotation.SubstringBackup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: efi  reason: default package */
/* loaded from: classes3.dex */
public final class efi {
    public static final smt a;

    static {
        Class[] clsArr = YouTubeBackupAgent.a;
        smt[] smtVarArr = new smt[2];
        smtVarArr[0] = new smu(smx.b(Backup.class, YouTubeBackupAgent.a));
        Set<String> b = smx.b(SubstringBackup.class, YouTubeBackupAgent.a);
        HashSet<smt> hashSet = new HashSet();
        for (String str : b) {
            hashSet.add(new smv(Pattern.compile(str)));
        }
        ArrayList arrayList = new ArrayList();
        for (smt smtVar : hashSet) {
            arrayList.add(smtVar);
        }
        smtVarArr[1] = smx.a(new ArrayList(arrayList));
        a = smx.a(Arrays.asList(smtVarArr));
    }
}
