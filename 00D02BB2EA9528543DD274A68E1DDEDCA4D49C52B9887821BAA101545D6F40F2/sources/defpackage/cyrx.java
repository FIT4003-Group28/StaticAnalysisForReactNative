package defpackage;

import com.google.android.filament.R;
import com.google.android.libraries.social.populous.storage.RoomDatabaseManager_Impl;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
/* compiled from: PG */
/* renamed from: cyrx  reason: default package */
/* loaded from: classes5.dex */
public final class cyrx extends bo {
    final /* synthetic */ RoomDatabaseManager_Impl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cyrx(RoomDatabaseManager_Impl roomDatabaseManager_Impl) {
        super(9);
        this.b = roomDatabaseManager_Impl;
    }

    @Override // defpackage.bo
    public final void a(avu avuVar) {
        avuVar.h("DROP TABLE IF EXISTS `CacheInfo`");
        avuVar.h("DROP TABLE IF EXISTS `Contacts`");
        avuVar.h("DROP TABLE IF EXISTS `ContextualCandidateContexts`");
        avuVar.h("DROP TABLE IF EXISTS `ContextualCandidates`");
        avuVar.h("DROP TABLE IF EXISTS `ContextualCandidateInfo`");
        avuVar.h("DROP TABLE IF EXISTS `ContextualCandidateTokens`");
        avuVar.h("DROP TABLE IF EXISTS `RpcCache`");
        avuVar.h("DROP TABLE IF EXISTS `Tokens`");
        List<bl> list = this.b.f;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                this.b.f.get(i).c();
            }
        }
    }

    @Override // defpackage.bo
    public final void b(avu avuVar) {
        avuVar.h("CREATE TABLE IF NOT EXISTS `CacheInfo` (`rowid` INTEGER NOT NULL, `last_updated` INTEGER NOT NULL, `num_contacts` INTEGER NOT NULL, `affinity_response_context` BLOB, PRIMARY KEY(`rowid`))");
        avuVar.h("CREATE TABLE IF NOT EXISTS `Contacts` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `affinity` REAL NOT NULL, `proto_bytes` BLOB)");
        avuVar.h("CREATE TABLE IF NOT EXISTS `ContextualCandidateContexts` (`candidate_id` TEXT NOT NULL, `context_id` TEXT NOT NULL, PRIMARY KEY(`candidate_id`, `context_id`))");
        avuVar.h("CREATE TABLE IF NOT EXISTS `ContextualCandidates` (`id` TEXT NOT NULL, `proto_bytes` BLOB NOT NULL, PRIMARY KEY(`id`))");
        avuVar.h("CREATE TABLE IF NOT EXISTS `ContextualCandidateInfo` (`candidate_id` TEXT NOT NULL, `last_updated` INTEGER NOT NULL, `last_accessed` INTEGER NOT NULL, PRIMARY KEY(`candidate_id`))");
        avuVar.h("CREATE VIRTUAL TABLE IF NOT EXISTS `ContextualCandidateTokens` USING FTS4(`candidate_id` TEXT NOT NULL, `value` TEXT NOT NULL, `source_type` TEXT NOT NULL, tokenize=unicode61 `tokenchars=@.-`, notindexed=`candidate_id`, notindexed=`source_type`, prefix=`1`)");
        avuVar.h("CREATE TABLE IF NOT EXISTS `RpcCache` (`type` TEXT NOT NULL, `key` TEXT NOT NULL, `timestamp` INTEGER NOT NULL, `proto_bytes` BLOB, PRIMARY KEY(`type`, `key`))");
        avuVar.h("CREATE INDEX IF NOT EXISTS `index_RpcCache_type_key_timestamp` ON `RpcCache` (`type`, `key`, `timestamp`)");
        avuVar.h("CREATE VIRTUAL TABLE IF NOT EXISTS `Tokens` USING FTS4(`contact_id` INTEGER NOT NULL, `value` TEXT, `affinity` REAL NOT NULL, `field_type` TEXT, tokenize=unicode61 `tokenchars=@.-`, notindexed=`contact_id`, notindexed=`affinity`, notindexed=`field_type`, prefix=`1`)");
        avuVar.h("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        avuVar.h("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '2a8ea406c25e0b55c6dc52862be9aa2a')");
    }

    @Override // defpackage.bo
    public final void c(avu avuVar) {
        this.b.a = avuVar;
        this.b.n(avuVar);
        List<bl> list = this.b.f;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                this.b.f.get(i).a(avuVar);
            }
        }
    }

    @Override // defpackage.bo
    public final bp d(avu avuVar) {
        HashMap hashMap = new HashMap(4);
        hashMap.put("rowid", new cb("rowid", "INTEGER", true, 1, null, 1));
        hashMap.put("last_updated", new cb("last_updated", "INTEGER", true, 0, null, 1));
        hashMap.put("num_contacts", new cb("num_contacts", "INTEGER", true, 0, null, 1));
        hashMap.put("affinity_response_context", new cb("affinity_response_context", "BLOB", false, 0, null, 1));
        cf cfVar = new cf("CacheInfo", hashMap, new HashSet(0), new HashSet(0));
        cf a = cf.a(avuVar, "CacheInfo");
        if (!cfVar.equals(a)) {
            String valueOf = String.valueOf(cfVar);
            String valueOf2 = String.valueOf(a);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + R.styleable.AppCompatTheme_switchStyle + String.valueOf(valueOf2).length());
            sb.append("CacheInfo(com.google.android.libraries.social.populous.storage.CacheInfoEntity).\n Expected:\n");
            sb.append(valueOf);
            sb.append("\n Found:\n");
            sb.append(valueOf2);
            return new bp(false, sb.toString());
        }
        HashMap hashMap2 = new HashMap(3);
        hashMap2.put("id", new cb("id", "INTEGER", true, 1, null, 1));
        hashMap2.put("affinity", new cb("affinity", "REAL", true, 0, null, 1));
        hashMap2.put("proto_bytes", new cb("proto_bytes", "BLOB", false, 0, null, 1));
        cf cfVar2 = new cf("Contacts", hashMap2, new HashSet(0), new HashSet(0));
        cf a2 = cf.a(avuVar, "Contacts");
        if (!cfVar2.equals(a2)) {
            String valueOf3 = String.valueOf(cfVar2);
            String valueOf4 = String.valueOf(a2);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf3).length() + 98 + String.valueOf(valueOf4).length());
            sb2.append("Contacts(com.google.android.libraries.social.populous.storage.ContactEntity).\n Expected:\n");
            sb2.append(valueOf3);
            sb2.append("\n Found:\n");
            sb2.append(valueOf4);
            return new bp(false, sb2.toString());
        }
        HashMap hashMap3 = new HashMap(2);
        hashMap3.put("candidate_id", new cb("candidate_id", "TEXT", true, 1, null, 1));
        hashMap3.put("context_id", new cb("context_id", "TEXT", true, 2, null, 1));
        cf cfVar3 = new cf("ContextualCandidateContexts", hashMap3, new HashSet(0), new HashSet(0));
        cf a3 = cf.a(avuVar, "ContextualCandidateContexts");
        if (!cfVar3.equals(a3)) {
            String valueOf5 = String.valueOf(cfVar3);
            String valueOf6 = String.valueOf(a3);
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf5).length() + 136 + String.valueOf(valueOf6).length());
            sb3.append("ContextualCandidateContexts(com.google.android.libraries.social.populous.storage.ContextualCandidateContextEntity).\n Expected:\n");
            sb3.append(valueOf5);
            sb3.append("\n Found:\n");
            sb3.append(valueOf6);
            return new bp(false, sb3.toString());
        }
        HashMap hashMap4 = new HashMap(2);
        hashMap4.put("id", new cb("id", "TEXT", true, 1, null, 1));
        hashMap4.put("proto_bytes", new cb("proto_bytes", "BLOB", true, 0, null, 1));
        cf cfVar4 = new cf("ContextualCandidates", hashMap4, new HashSet(0), new HashSet(0));
        cf a4 = cf.a(avuVar, "ContextualCandidates");
        if (!cfVar4.equals(a4)) {
            String valueOf7 = String.valueOf(cfVar4);
            String valueOf8 = String.valueOf(a4);
            StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf7).length() + R.styleable.AppCompatTheme_windowFixedWidthMajor + String.valueOf(valueOf8).length());
            sb4.append("ContextualCandidates(com.google.android.libraries.social.populous.storage.ContextualCandidateEntity).\n Expected:\n");
            sb4.append(valueOf7);
            sb4.append("\n Found:\n");
            sb4.append(valueOf8);
            return new bp(false, sb4.toString());
        }
        HashMap hashMap5 = new HashMap(3);
        hashMap5.put("candidate_id", new cb("candidate_id", "TEXT", true, 1, null, 1));
        hashMap5.put("last_updated", new cb("last_updated", "INTEGER", true, 0, null, 1));
        hashMap5.put("last_accessed", new cb("last_accessed", "INTEGER", true, 0, null, 1));
        cf cfVar5 = new cf("ContextualCandidateInfo", hashMap5, new HashSet(0), new HashSet(0));
        cf a5 = cf.a(avuVar, "ContextualCandidateInfo");
        if (!cfVar5.equals(a5)) {
            String valueOf9 = String.valueOf(cfVar5);
            String valueOf10 = String.valueOf(a5);
            StringBuilder sb5 = new StringBuilder(String.valueOf(valueOf9).length() + 129 + String.valueOf(valueOf10).length());
            sb5.append("ContextualCandidateInfo(com.google.android.libraries.social.populous.storage.ContextualCandidateInfoEntity).\n Expected:\n");
            sb5.append(valueOf9);
            sb5.append("\n Found:\n");
            sb5.append(valueOf10);
            return new bp(false, sb5.toString());
        }
        HashSet hashSet = new HashSet(3);
        hashSet.add("candidate_id");
        hashSet.add("value");
        hashSet.add("source_type");
        bz bzVar = new bz("ContextualCandidateTokens", hashSet, "CREATE VIRTUAL TABLE IF NOT EXISTS `ContextualCandidateTokens` USING FTS4(`candidate_id` TEXT NOT NULL, `value` TEXT NOT NULL, `source_type` TEXT NOT NULL, tokenize=unicode61 `tokenchars=@.-`, notindexed=`candidate_id`, notindexed=`source_type`, prefix=`1`)");
        bz a6 = bz.a(avuVar, "ContextualCandidateTokens");
        if (!bzVar.equals(a6)) {
            String valueOf11 = String.valueOf(bzVar);
            String valueOf12 = String.valueOf(a6);
            StringBuilder sb6 = new StringBuilder(String.valueOf(valueOf11).length() + 132 + String.valueOf(valueOf12).length());
            sb6.append("ContextualCandidateTokens(com.google.android.libraries.social.populous.storage.ContextualCandidateTokenEntity).\n Expected:\n");
            sb6.append(valueOf11);
            sb6.append("\n Found:\n");
            sb6.append(valueOf12);
            return new bp(false, sb6.toString());
        }
        HashMap hashMap6 = new HashMap(4);
        hashMap6.put("type", new cb("type", "TEXT", true, 1, null, 1));
        hashMap6.put("key", new cb("key", "TEXT", true, 2, null, 1));
        hashMap6.put("timestamp", new cb("timestamp", "INTEGER", true, 0, null, 1));
        hashMap6.put("proto_bytes", new cb("proto_bytes", "BLOB", false, 0, null, 1));
        HashSet hashSet2 = new HashSet(0);
        HashSet hashSet3 = new HashSet(1);
        hashSet3.add(new ce("index_RpcCache_type_key_timestamp", false, Arrays.asList("type", "key", "timestamp")));
        cf cfVar6 = new cf("RpcCache", hashMap6, hashSet2, hashSet3);
        cf a7 = cf.a(avuVar, "RpcCache");
        if (!cfVar6.equals(a7)) {
            String valueOf13 = String.valueOf(cfVar6);
            String valueOf14 = String.valueOf(a7);
            StringBuilder sb7 = new StringBuilder(String.valueOf(valueOf13).length() + 99 + String.valueOf(valueOf14).length());
            sb7.append("RpcCache(com.google.android.libraries.social.populous.storage.RpcCacheEntity).\n Expected:\n");
            sb7.append(valueOf13);
            sb7.append("\n Found:\n");
            sb7.append(valueOf14);
            return new bp(false, sb7.toString());
        }
        HashSet hashSet4 = new HashSet(4);
        hashSet4.add("contact_id");
        hashSet4.add("value");
        hashSet4.add("affinity");
        hashSet4.add("field_type");
        bz bzVar2 = new bz("Tokens", hashSet4, "CREATE VIRTUAL TABLE IF NOT EXISTS `Tokens` USING FTS4(`contact_id` INTEGER NOT NULL, `value` TEXT, `affinity` REAL NOT NULL, `field_type` TEXT, tokenize=unicode61 `tokenchars=@.-`, notindexed=`contact_id`, notindexed=`affinity`, notindexed=`field_type`, prefix=`1`)");
        bz a8 = bz.a(avuVar, "Tokens");
        if (!bzVar2.equals(a8)) {
            String valueOf15 = String.valueOf(bzVar2);
            String valueOf16 = String.valueOf(a8);
            StringBuilder sb8 = new StringBuilder(String.valueOf(valueOf15).length() + 94 + String.valueOf(valueOf16).length());
            sb8.append("Tokens(com.google.android.libraries.social.populous.storage.TokenEntity).\n Expected:\n");
            sb8.append(valueOf15);
            sb8.append("\n Found:\n");
            sb8.append(valueOf16);
            return new bp(false, sb8.toString());
        }
        return new bp(true, null);
    }

    @Override // defpackage.bo
    public final void e(avu avuVar) {
        by.a(avuVar);
    }

    @Override // defpackage.bo
    public final void f() {
        List<bl> list = this.b.f;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                this.b.f.get(i).b();
            }
        }
    }
}
