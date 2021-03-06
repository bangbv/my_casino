// automatically generated by the FlatBuffers compiler, do not modify

package vn.com.vng.gsmobile.casino.flatbuffers;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class UserAchievement extends Table {
  public static UserAchievement getRootAsUserAchievement(ByteBuffer _bb) { return getRootAsUserAchievement(_bb, new UserAchievement()); }
  public static UserAchievement getRootAsUserAchievement(ByteBuffer _bb, UserAchievement obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__init(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public UserAchievement __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; return this; }

  public long id() { int o = __offset(4); return o != 0 ? (long)bb.getInt(o + bb_pos) & 0xFFFFFFFFL : 0; }
  public boolean mutateId(long id) { int o = __offset(4); if (o != 0) { bb.putInt(o + bb_pos, (int)id); return true; } else { return false; } }
  public long level() { int o = __offset(6); return o != 0 ? (long)bb.getInt(o + bb_pos) & 0xFFFFFFFFL : 0; }
  public boolean mutateLevel(long level) { int o = __offset(6); if (o != 0) { bb.putInt(o + bb_pos, (int)level); return true; } else { return false; } }
  public long cnt() { int o = __offset(8); return o != 0 ? (long)bb.getInt(o + bb_pos) & 0xFFFFFFFFL : 0; }
  public boolean mutateCnt(long cnt) { int o = __offset(8); if (o != 0) { bb.putInt(o + bb_pos, (int)cnt); return true; } else { return false; } }

  public static int createUserAchievement(FlatBufferBuilder builder,
      long id,
      long level,
      long cnt) {
    builder.startObject(3);
    UserAchievement.addCnt(builder, cnt);
    UserAchievement.addLevel(builder, level);
    UserAchievement.addId(builder, id);
    return UserAchievement.endUserAchievement(builder);
  }

  public static void startUserAchievement(FlatBufferBuilder builder) { builder.startObject(3); }
  public static void addId(FlatBufferBuilder builder, long id) { builder.addInt(0, (int)id, 0); }
  public static void addLevel(FlatBufferBuilder builder, long level) { builder.addInt(1, (int)level, 0); }
  public static void addCnt(FlatBufferBuilder builder, long cnt) { builder.addInt(2, (int)cnt, 0); }
  public static int endUserAchievement(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
}

