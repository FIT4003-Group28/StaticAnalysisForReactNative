package defpackage;

import java.io.IOException;
import java.util.Collections;
/* compiled from: PG */
/* renamed from: twd  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class twd implements ampg {
    public final /* synthetic */ twg a;
    private final /* synthetic */ int b;

    public /* synthetic */ twd(twg twgVar) {
        this.a = twgVar;
    }

    public /* synthetic */ twd(twg twgVar, int i) {
        this.b = i;
        this.a = twgVar;
    }

    @Override // defpackage.ampg
    public final Object apply(Object obj) {
        int i = this.b;
        if (i == 0) {
            twg twgVar = this.a;
            trb trbVar = (trb) obj;
            int i2 = typ.a;
            aopa mo52toBuilder = trbVar.mo52toBuilder();
            for (String str : Collections.unmodifiableMap(trbVar.b).keySet()) {
                try {
                    tqy b = tzh.b(str, twgVar.a, twgVar.b);
                    str.getClass();
                    aoqp aoqpVar = trbVar.b;
                    tqz tqzVar = aoqpVar.containsKey(str) ? (tqz) aoqpVar.get(str) : null;
                    mo52toBuilder.B(str);
                    if (tqzVar == null) {
                        typ.c("%s: Unable to read sharedFile from ProtoDataStore.", "ProtoDataStoreSharedFilesMetadata");
                    } else {
                        mo52toBuilder.A(tzh.e(b), tqzVar);
                    }
                } catch (tzg e) {
                    typ.d("%s Failed to deserialize file key %s, remove and continue.", "ProtoDataStoreSharedFilesMetadata", str);
                    twgVar.b.a(e, "Failed to deserialize file key, remove and continue.", new Object[0]);
                    mo52toBuilder.B(str);
                }
            }
            return (trb) mo52toBuilder.mo39build();
        } else if (i != 1) {
            if (i == 2) {
                twg twgVar2 = this.a;
                typ.b("Failed to commit migration metadata to disk");
                twgVar2.b.a(new Exception("Migration to DownloadTransform failed.", (IOException) obj), "Failed to commit migration metadata to disk.", new Object[0]);
                return false;
            }
            twg twgVar3 = this.a;
            typ.b("Failed to commit migration metadata to disk");
            twgVar3.b.a(new Exception("Migration to ChecksumOnly failed.", (IOException) obj), "Failed to commit migration metadata to disk.", new Object[0]);
            return false;
        } else {
            twg twgVar4 = this.a;
            trb trbVar2 = (trb) obj;
            int i3 = typ.a;
            aopa mo52toBuilder2 = trbVar2.mo52toBuilder();
            for (String str2 : Collections.unmodifiableMap(trbVar2.b).keySet()) {
                try {
                    tqy b2 = tzh.b(str2, twgVar4.a, twgVar4.b);
                    str2.getClass();
                    aoqp aoqpVar2 = trbVar2.b;
                    tqz tqzVar2 = aoqpVar2.containsKey(str2) ? (tqz) aoqpVar2.get(str2) : null;
                    mo52toBuilder2.B(str2);
                    if (tqzVar2 == null) {
                        typ.c("%s: Unable to read sharedFile from ProtoDataStore.", "ProtoDataStoreSharedFilesMetadata");
                    } else {
                        mo52toBuilder2.A(tzh.f(b2), tqzVar2);
                    }
                } catch (tzg e2) {
                    typ.d("%s Failed to deserialize file key %s, remove and continue.", "ProtoDataStoreSharedFilesMetadata", str2);
                    twgVar4.b.a(e2, "Failed to deserialize file key, remove and continue.", new Object[0]);
                    mo52toBuilder2.B(str2);
                }
            }
            return (trb) mo52toBuilder2.mo39build();
        }
    }
}
